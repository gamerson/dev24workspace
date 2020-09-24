/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package sample.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import sample.model.Sample;

/**
 * The cache model class for representing Sample in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SampleCacheModel implements CacheModel<Sample>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SampleCacheModel)) {
			return false;
		}

		SampleCacheModel sampleCacheModel = (SampleCacheModel)object;

		if (sampleId == sampleCacheModel.sampleId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sampleId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", sampleId=");
		sb.append(sampleId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", field1=");
		sb.append(field1);
		sb.append(", field2=");
		sb.append(field2);
		sb.append(", field3=");
		sb.append(field3);
		sb.append(", field4=");
		sb.append(field4);
		sb.append(", field5=");
		sb.append(field5);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Sample toEntityModel() {
		SampleImpl sampleImpl = new SampleImpl();

		if (uuid == null) {
			sampleImpl.setUuid("");
		}
		else {
			sampleImpl.setUuid(uuid);
		}

		sampleImpl.setSampleId(sampleId);
		sampleImpl.setGroupId(groupId);
		sampleImpl.setCompanyId(companyId);
		sampleImpl.setUserId(userId);

		if (userName == null) {
			sampleImpl.setUserName("");
		}
		else {
			sampleImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sampleImpl.setCreateDate(null);
		}
		else {
			sampleImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sampleImpl.setModifiedDate(null);
		}
		else {
			sampleImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (field1 == null) {
			sampleImpl.setField1("");
		}
		else {
			sampleImpl.setField1(field1);
		}

		sampleImpl.setField2(field2);
		sampleImpl.setField3(field3);

		if (field4 == Long.MIN_VALUE) {
			sampleImpl.setField4(null);
		}
		else {
			sampleImpl.setField4(new Date(field4));
		}

		if (field5 == null) {
			sampleImpl.setField5("");
		}
		else {
			sampleImpl.setField5(field5);
		}

		sampleImpl.resetOriginalValues();

		return sampleImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		sampleId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		field1 = objectInput.readUTF();

		field2 = objectInput.readBoolean();

		field3 = objectInput.readInt();
		field4 = objectInput.readLong();
		field5 = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(sampleId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (field1 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(field1);
		}

		objectOutput.writeBoolean(field2);

		objectOutput.writeInt(field3);
		objectOutput.writeLong(field4);

		if (field5 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(field5);
		}
	}

	public String uuid;
	public long sampleId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String field1;
	public boolean field2;
	public int field3;
	public long field4;
	public String field5;

}