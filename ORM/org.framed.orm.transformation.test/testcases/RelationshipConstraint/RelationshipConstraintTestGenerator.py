#!/usr/bin/env python

#FRaMED testcase generator for (n)-relationships and relationship constraints.
#
#This generator creates testcases for (n)-relationships or testcases for (n)-relationships with all possible combinations of constraints (unregarded impossible constraint combination, e.g. cyclic - acyclic). The generator will create a new folder (Relationship or RelationshipConstraint) in which all testcases (relationship_test_n/relationshipconstraint_test_n) are created. It is called by cmd/terminal with:
#   "python TestGenerator.py n" (Create testcases for n-relationships)
#   "python TestGenerator.py n true" (Create testcases for n-relationships with all possible constraint combinations)

import sys, os, itertools

__author__ = "Duc Dung Dam"
__date__ = "24/04/16"
__version__ = "1.0"
__maintainer__ = "Duc Dung Dam"
__email__ = "dung.dam_duc@tu-dresden.de"
__status__ = "Prototype"


types = ['RoleType']
constraints = ['Irreflexive', 'Reflexive', 'Cyclic', 'Acyclic', 'Total']

def write(filename, content, mode):
	#0 = create relationship tests
	#1 = create relationshipconstraint tests
	if mode == 0:
		path = os.path.dirname(os.path.realpath(__file__))+"/Relationship";
		if not os.path.exists(path):
			os.mkdir(path)
		dirPath = "Relationship/"
	if mode == 1:
		path = os.path.dirname(os.path.realpath(__file__))+"/RelationshipConstraint";
		if not os.path.exists(path):
			os.mkdir(path)
		dirPath = "RelationshipConstraint/"
	filename += '.xmi'
	try:
		file = open(dirPath+filename, "w")
		file.write(content)
		file.close()
	except:
		sys.exit(0)

def createRelationshipTestcases(n):
	print "createRelationshipTestcases"

	for x in types:
		for y in range(1, n+1):
			content = framedModel = cromModel = ''

			#Header
			filename = 'relationship_test_'+str(y)
			description = "TestCase for "+ str(y) +" relationship(s) between two " + x + "(s)"
			title = "TestCase for "+ str(y) +" relationship(s)"
			header = ('<?xml version="1.0" encoding="ASCII"?>\n'
			'<ts:TestCase\n'
			'\txmi:version=\"2.0"\n'
			'\txmlns:xmi="http://www.omg.org/XMI"\n'
			'\txmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"\n'
			'\txmlns:crom_l1_composed="platform:/resource/org.rosi.crom.metamodel/"\n'
			'\txmlns:org.framed.orm.model="http://orm/1.0"\n'
			'\txmlns:ts="http://org.framed/testmodel"\n'
			'\ttitle="'+title+'"\n'
			'\tdescription="'+description+'">\n')
			content += header
			print filename

			#FramedModel
			framedModel += ('\t<framedModel>\n'
			'\t\t<elements\n'
			'\t\t\txsi:type="org.framed.orm.model:Shape"\n'
			'\t\t\tname="Test">\n'
			'\t\t\t<model>\n')

			#FramedModel - Elements
			#FramedModel - Elements - Loop for outgoingRelations/incomingRelations
			framedRelations = ''
			for z in range (0, y):
				framedRelations += '//@framedModel/@elements.0/@model/@elements.'+str(z+2)+' '
			framedRelations = framedRelations[:-1]
			framedModel += ('\t\t\t\t<elements\n'
			'\t\t\t\t\txsi:type="org.framed.orm.model:Shape"\n'
			'\t\t\t\t\tname="RoleType1"\n'
			'\t\t\t\t\toutgoingRelations="')
			framedModel += framedRelations
			framedModel += '"\n\t\t\t\t\ttype="'+ x +'"/>\n'
			framedModel += ('\t\t\t\t<elements\n'
			'\t\t\t\t\txsi:type="org.framed.orm.model:Shape"\n'
			'\t\t\t\t\tname="RoleType2"\n'
			'\t\t\t\t\tincomingRelations="')
			framedModel += framedRelations
			framedModel += '\"\n\t\t\t\t\ttype=\"'+ x +'\"/>\n'

			#FramedModel - Relations
			for z in range (0, y):
				framedModel += ('\t\t\t\t<elements\n'
				'\t\t\t\t\txsi:type="org.framed.orm.model:Relation"\n'
				'\t\t\t\t\tname="testRelation_'+str(z)+'"\n'
				'\t\t\t\t\ttype="Relationship"\n'
				'\t\t\t\t\ttarget="//@framedModel/@elements.0/@model/@elements.1"\n'
				'\t\t\t\t\tsource="//@framedModel/@elements.0/@model/@elements.0"/>\n')

			framedModel += ('\t\t\t</model>\n'
			'\t\t</elements>\n'
			'\t</framedModel>\n')
			content += framedModel

			#CromModel
			cromModel += ('\t<cromModel>\n'
			'\t\t<elements\n'
			'\t\t\txsi:type="crom_l1_composed:CompartmentType"\n'
			'\t\t\tname="Test">\n')

			#CromModel - Elements
			#CromModel - Elements - Loop for outgoingRelations/incomingRelations
			cromRelations = ''
			for z in range (0, y):
				cromRelations += '//@cromModel/@elements.0/@relationships.'+str(z)+' '
			cromRelations = cromRelations[:-1]
			cromModel += ('\t\t\t<parts>\n'
			'\t\t\t\t<role\n'
			'\t\t\t\txsi:type="crom_l1_composed:'+ x +'"\n'
			'\t\t\t\tname="RoleType1"\n'
			'\t\t\t\toutgoing=\"')
			cromModel += cromRelations
			cromModel += ('"/>\n'
			'\t\t\t</parts>\n')

			cromModel += ('\t\t\t<parts>\n'
			'\t\t\t\t<role\n'
			'\t\t\t\t\txsi:type="crom_l1_composed:'+ x +'"\n'
			'\t\t\t\t\tname="RoleType2"\n'
			'\t\t\t\t\tincoming="')
			cromModel += cromRelations
			cromModel += ('"/>\n'
			'\t\t\t</parts>\n')

			#CromModel - Relations
			for z in xrange(0, y):
				cromModel += '\t\t\t<relationships name=\"testRelation_'+ str(z) +'\"/>\n'

			cromModel += ('\t\t</elements>\n'
			'\t</cromModel>\n')
			content += cromModel

			#Footer
			footer = "</ts:TestCase>"
			content += footer

			write(filename, content, 0)

def createRelationshipConstraintsTestcases(n):
	print "createRelationshipConstraintsTestcases"

	#Generate all possible combinations of constraints for n relationships
	cons = []
	for y in range(1,len(constraints)+1):
			cons.extend(itertools.combinations(constraints, y))
	cons_combinations = []
	for n_relationship in range(1, n+1):		
		cons_combinations.extend(itertools.product(cons, repeat = n_relationship))
	
	#Start generate testcase
	counter = 1
	for tupel_constraint in cons_combinations:
		#print "testcase with " + str(len(tupel_constraint)) + " relationship(s) and " + str(tupel_constraint) + " constraint(s)"
	
	#Init
		content = framedModel = cromModel = ''

		#Create all elements for FramedModel and CromModel
		
		framedRelations = framedRelationships = framedConstraints = ''
		cromRelations = cromRelationships = cromConstraints = ''
		

		framedElementsCounter = 2 #2 because elements.0 and elements.1 are Roletypes
		relationshipCounter = 0
		framedElementsConstraintCounter = framedElementsCounter+len(tupel_constraint) 
		
		for constraint in tupel_constraint:
			#outgoing/incoming relations
				#framedModel
			framedRelations += '//@framedModel/@elements.0/@model/@elements.'+str(framedElementsCounter)+" "
				#cromModel
			cromRelations += '//@cromModel/@elements.0/@relationships.'+str(relationshipCounter)+" "
			#constraint elements
			referencedRelation = 'referencedRelation="'
			for element_constraint in constraint:
				#framedModel
				framedConstraints += ('\t\t\t\t<elements\n'
				'\t\t\t\t\txsi:type="org.framed.orm.model:Relation"\n'
				'\t\t\t\t\tname="'+element_constraint+'" type="'+element_constraint+'"\n'
				'\t\t\t\t\ttarget="//@framedModel/@elements.0/@model/@elements.1"\n'
				'\t\t\t\t\tsource="//@framedModel/@elements.0/@model/@elements.0"\n'
				'\t\t\t\t\treferencedRelation="//@framedModel/@elements.0/@model/@elements.'+str(framedElementsCounter)+'"/>\n')
				referencedRelation += '//@framedModel/@elements.0/@model/@elements.'+str(framedElementsConstraintCounter)+' '
				framedElementsConstraintCounter += 1
				#cromModel
				cromConstraints += ('\t\t\t\t<constraints\n'
					'\t\t\t\t\txsi:type="crom_l1_composed:'+element_constraint+'"\n'
					'\t\t\t\t\trelation="//@cromModel/@elements.0/@relationships.'+str(relationshipCounter)+'"/>\n')
			referencedRelation = referencedRelation[:-1]+'"'
						
			#relationship elements
			#framedModel
			framedRelationships += ('\t\t\t\t<elements\n'
				'\t\t\t\t\txsi:type="org.framed.orm.model:Relation"\n'
				'\t\t\t\t\tname="testRelation_' +str(relationshipCounter)+ '"\n'
				'\t\t\t\t\ttype="Relationship"\n'
				'\t\t\t\t\ttarget="//@framedModel/@elements.0/@model/@elements.1"\n'
				'\t\t\t\t\tsource="//@framedModel/@elements.0/@model/@elements.0"\n'
				'\t\t\t\t\t'+referencedRelation+'/>\n')

			#cromModel
			cromRelationships += ('\t\t\t\t<relationships name="testRelation_'+str(relationshipCounter)+'"/>\n')

			framedElementsCounter += 1
			relationshipCounter += 1
		
	#Header
		filename = 'relationshipconstraint_test_'+str(counter)
		description = "TestCase for "+ str(len(tupel_constraint)) +" relationship(s) with constraints "+ str(tupel_constraint) +" between two " + types[0]
		title = "TestCase for "+ str(len(tupel_constraint)) +" relationship(s) with constraints "+ str(tupel_constraint)
		header = ("<?xml version=\"1.0\" encoding=\"ASCII\"?>\n"
			"<ts:TestCase\n"
			"\txmi:version=\"2.0\"\n"
			"\txmlns:xmi=\"http://www.omg.org/XMI\"\n"
			"\txmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n"
			"\txmlns:crom_l1_composed=\"platform:/resource/org.rosi.crom.metamodel/\"\n"
			"\txmlns:org.framed.orm.model=\"http://orm/1.0\"\n"
			"\txmlns:ts=\"http://org.framed/testmodel\"\n"
			"\ttitle=\""+title+"\"\n"
			"\tdescription=\""+description+"\">\n")
		content += header
	#FramedModel
		#Header	
		framedModel += '\t<framedModel>\n'
		#Content
		framedModel += ('\t\t<elements\n'
			'\t\t\txsi:type="org.framed.orm.model:Shape"\n'
			'\t\t\tname="Test">\n'
			'\t\t\t<model>\n'
			#Roletype1
			'\t\t\t\t<elements\n'
			'\t\t\t\t\t\txsi:type="org.framed.orm.model:Shape"\n'
			'\t\t\t\t\t\tname="'+types[0]+'1"\n'
			'\t\t\t\t\t\toutgoingRelations="'+framedRelations+'"\n'
			'\t\t\t\t\t\ttype="RoleType"/>\n'
			#Roletype2
			'\t\t\t\t<elements\n'
			'\t\t\t\t\t\txsi:type="org.framed.orm.model:Shape"\n'
			'\t\t\t\t\t\tname="'+types[0]+'2"\n'
			'\t\t\t\t\t\tincomingRelations="'+framedRelations+'"\n'
			'\t\t\t\t\t\ttype="RoleType"/>\n')
		#Relationships
		framedModel += framedRelationships
		#Constraints
		framedModel += framedConstraints
		#Footer
		framedModel += ('\t\t\t</model>\n'
			'\t\t</elements>\n'
			'\t</framedModel>\n')
		content += framedModel

	#CromModel
		#Header
		cromModel += '\t<cromModel>\n'
		#Content
		cromModel += ('\t\t<elements\n'
			'\t\t\txsi:type="crom_l1_composed:CompartmentType"\n'
			'\t\t\tname="Test">\n'
			#Roletype1
			'\t\t\t<parts>\n'
			'\t\t\t\t<role\n'
			'\t\t\t\t\txsi:type="crom_l1_composed:RoleType"\n'
			'\t\t\t\t\tname="RoleType1"\n'
			'\t\t\t\t\toutgoing="'+cromRelations+'"/>\n'
			'\t\t\t</parts>\n'
			#Roletype2
			'\t\t\t<parts>\n'
			'\t\t\t\t<role\n'
			'\t\t\t\t\txsi:type="crom_l1_composed:RoleType"\n'
			'\t\t\t\t\tname="RoleType2"\n'
			'\t\t\t\t\tincoming="'+cromRelations+'"/>\n'
			'\t\t\t</parts>\n')
		#Relationships
		cromModel += cromRelationships
		#Constraints
		cromModel += cromConstraints
		#Footer
		cromModel += ('\t\t</elements>\n'
			'\t</cromModel>\n')
		content += cromModel

	#Footer
		footer = "</ts:TestCase>"
		content += footer

		write(filename, content, 1)
		counter += 1

def init():
	print "Generating Testcases:"
	if sys.argv is not None:
		#python TestGenerator (int)n (creates testcases from 1 to n relationships)
		if len(sys.argv) == 2:
			createRelationshipTestcases(int(sys.argv[1]))

        #python TestGenerator (int)n (bool)true (creates testcases from 1 to n relationships with all possible constraint combinations)
		if len(sys.argv) == 3 and bool(sys.argv[2]) is True:
			createRelationshipConstraintsTestcases(int(sys.argv[1]))
	else:
		createRelationshipTestcases(1)

init()
