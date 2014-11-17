#!/bin/bash

# Publish Javadoc for branch `master` to the GitHub pages.

if [ "$TRAVIS_REPO_SLUG" == "leondart/FRaMED" ] && [ "$TRAVIS_PULL_REQUEST" == "false" ] && [ "$TRAVIS_BRANCH" == "master" ]; then
    echo -e "Publishing Javadoc ...\n"
  
    cd ORM/org.framed.orm.build/
    mvn javadoc:aggregate -q -ff -B -P nocheck

    cp -R target/site/apidocs $HOME/javadoc

    cd $HOME
    git config --global user.email "travis@travis-ci.org"
    git config --global user.name "travis-ci"
    git clone --quiet --branch=gh-pages https://${GH_TOKEN}@github.com/leondart/FRaMED gh-pages > /dev/null

    cd gh-pages
    git rm -rf ./javadoc/$TRAVIS_BRANCH
    mkdir -p ./javadoc/$TRAVIS_BRANCH
    cp -Rf $HOME/javadoc ./javadoc/$TRAVIS_BRANCH
    git add -f .
    git commit -m "Latest javadoc on successful travis build $TRAVIS_BUILD_NUMBER of branch $TRAVIS_BRANCH auto-pushed to gh-pages."
    git push -fq origin gh-pages > /dev/null

    echo -e "Published Javadoc to gh-pages.\n"
fi

