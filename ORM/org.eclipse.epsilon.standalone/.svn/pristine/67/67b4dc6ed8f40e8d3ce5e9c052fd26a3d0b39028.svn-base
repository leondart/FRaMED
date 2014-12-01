package org.eclipse.epsilon.standalone.attributes;

import org.eclipse.epsilon.standalone.jobs.EtlTransformOperationJob;

public enum EtlExtensionAttribute {
	ETL_TRANSFORM ("etlTransform", 0),
	SOURCE_NAME ("sourceName", 1),
	SOURCE_META_MODEL_URI ("sourceMetaModelURI", 2 ),
	SOURCE_MODEL_FILE_PATH ("sourceModelFilePath", 3),
	SOURCE_READ_ON_LOAD ("sourceReadOnLoad", 4),
	SOURCE_SAVE_ON_DISPOSAL ("sourceStoreOnDisposal", 5),
	TARGET_NAME ("targetName", 6),
	TARGET_META_MODEL_URI ("targetMetaModelURI", 7),
	TARGET_MODEL_FILE_PATH ("targetModelFilePath", 8),
	TARGET_READ_ON_LOAD ("targetReadOnLoad", 9),
	TARGET_SAVE_ON_DISPOSAL ("targetStoreOnDisposal", 10);

	private String name;
	private int index;

	EtlExtensionAttribute(String name, int index) {
		this.name = name;
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAttributeFor(EtlTransformOperationJob job,
			String attributeValue) {
		if (attributeValue == null)
			return;
		switch (this.index) {
		case 0:
			job.setEtlTransformation(attributeValue);
			break;
		case 1:
			job.setSourceName(attributeValue);
			break;
		case 2:
			job.setSourceMetaModelURI(attributeValue);
			break;
		case 3:
			job.setsourceModelFilePath(attributeValue);
			break;
		case 4:
			job.setSourceReadOnLoad(Boolean.valueOf(attributeValue)
					.booleanValue());
			break;
		case 5:
			job.setSourceSaveOnDispose(Boolean.valueOf(attributeValue)
					.booleanValue());
			break;
		case 6:
			job.setTargetName(attributeValue);
			break;
		case 7:
			job.setTargetMetaModelURI(attributeValue);
			break;
		case 8:
			job.setTargetModelFile(attributeValue);
			break;
		case 9:
			job.setTargetReadOnLoad(Boolean.valueOf(attributeValue)
					.booleanValue());
			break;
		case 10:
			job.setTargetSaveOnDispose(Boolean.valueOf(attributeValue)
					.booleanValue());
			break;
		}
	}
}
