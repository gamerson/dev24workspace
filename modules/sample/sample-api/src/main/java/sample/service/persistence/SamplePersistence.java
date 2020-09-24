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

package sample.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

import sample.exception.NoSuchSampleException;

import sample.model.Sample;

/**
 * The persistence interface for the sample service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SampleUtil
 * @generated
 */
@ProviderType
public interface SamplePersistence extends BasePersistence<Sample> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SampleUtil} to access the sample persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the samples where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching samples
	 */
	public java.util.List<Sample> findByUuid(String uuid);

	/**
	 * Returns a range of all the samples where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SampleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of samples
	 * @param end the upper bound of the range of samples (not inclusive)
	 * @return the range of matching samples
	 */
	public java.util.List<Sample> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the samples where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SampleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of samples
	 * @param end the upper bound of the range of samples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching samples
	 */
	public java.util.List<Sample> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Sample>
			orderByComparator);

	/**
	 * Returns an ordered range of all the samples where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SampleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of samples
	 * @param end the upper bound of the range of samples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching samples
	 */
	public java.util.List<Sample> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Sample>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sample in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sample
	 * @throws NoSuchSampleException if a matching sample could not be found
	 */
	public Sample findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Sample>
				orderByComparator)
		throws NoSuchSampleException;

	/**
	 * Returns the first sample in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sample, or <code>null</code> if a matching sample could not be found
	 */
	public Sample fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Sample>
			orderByComparator);

	/**
	 * Returns the last sample in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sample
	 * @throws NoSuchSampleException if a matching sample could not be found
	 */
	public Sample findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Sample>
				orderByComparator)
		throws NoSuchSampleException;

	/**
	 * Returns the last sample in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sample, or <code>null</code> if a matching sample could not be found
	 */
	public Sample fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Sample>
			orderByComparator);

	/**
	 * Returns the samples before and after the current sample in the ordered set where uuid = &#63;.
	 *
	 * @param sampleId the primary key of the current sample
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sample
	 * @throws NoSuchSampleException if a sample with the primary key could not be found
	 */
	public Sample[] findByUuid_PrevAndNext(
			long sampleId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Sample>
				orderByComparator)
		throws NoSuchSampleException;

	/**
	 * Removes all the samples where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of samples where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching samples
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the sample where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSampleException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sample
	 * @throws NoSuchSampleException if a matching sample could not be found
	 */
	public Sample findByUUID_G(String uuid, long groupId)
		throws NoSuchSampleException;

	/**
	 * Returns the sample where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sample, or <code>null</code> if a matching sample could not be found
	 */
	public Sample fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the sample where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sample, or <code>null</code> if a matching sample could not be found
	 */
	public Sample fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the sample where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the sample that was removed
	 */
	public Sample removeByUUID_G(String uuid, long groupId)
		throws NoSuchSampleException;

	/**
	 * Returns the number of samples where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching samples
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the samples where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching samples
	 */
	public java.util.List<Sample> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the samples where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SampleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of samples
	 * @param end the upper bound of the range of samples (not inclusive)
	 * @return the range of matching samples
	 */
	public java.util.List<Sample> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the samples where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SampleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of samples
	 * @param end the upper bound of the range of samples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching samples
	 */
	public java.util.List<Sample> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Sample>
			orderByComparator);

	/**
	 * Returns an ordered range of all the samples where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SampleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of samples
	 * @param end the upper bound of the range of samples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching samples
	 */
	public java.util.List<Sample> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Sample>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sample in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sample
	 * @throws NoSuchSampleException if a matching sample could not be found
	 */
	public Sample findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Sample>
				orderByComparator)
		throws NoSuchSampleException;

	/**
	 * Returns the first sample in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sample, or <code>null</code> if a matching sample could not be found
	 */
	public Sample fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Sample>
			orderByComparator);

	/**
	 * Returns the last sample in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sample
	 * @throws NoSuchSampleException if a matching sample could not be found
	 */
	public Sample findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Sample>
				orderByComparator)
		throws NoSuchSampleException;

	/**
	 * Returns the last sample in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sample, or <code>null</code> if a matching sample could not be found
	 */
	public Sample fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Sample>
			orderByComparator);

	/**
	 * Returns the samples before and after the current sample in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param sampleId the primary key of the current sample
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sample
	 * @throws NoSuchSampleException if a sample with the primary key could not be found
	 */
	public Sample[] findByUuid_C_PrevAndNext(
			long sampleId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Sample>
				orderByComparator)
		throws NoSuchSampleException;

	/**
	 * Removes all the samples where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of samples where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching samples
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the samples where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @return the matching samples
	 */
	public java.util.List<Sample> findByField2(boolean field2);

	/**
	 * Returns a range of all the samples where field2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SampleModelImpl</code>.
	 * </p>
	 *
	 * @param field2 the field2
	 * @param start the lower bound of the range of samples
	 * @param end the upper bound of the range of samples (not inclusive)
	 * @return the range of matching samples
	 */
	public java.util.List<Sample> findByField2(
		boolean field2, int start, int end);

	/**
	 * Returns an ordered range of all the samples where field2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SampleModelImpl</code>.
	 * </p>
	 *
	 * @param field2 the field2
	 * @param start the lower bound of the range of samples
	 * @param end the upper bound of the range of samples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching samples
	 */
	public java.util.List<Sample> findByField2(
		boolean field2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Sample>
			orderByComparator);

	/**
	 * Returns an ordered range of all the samples where field2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SampleModelImpl</code>.
	 * </p>
	 *
	 * @param field2 the field2
	 * @param start the lower bound of the range of samples
	 * @param end the upper bound of the range of samples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching samples
	 */
	public java.util.List<Sample> findByField2(
		boolean field2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Sample>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sample in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sample
	 * @throws NoSuchSampleException if a matching sample could not be found
	 */
	public Sample findByField2_First(
			boolean field2,
			com.liferay.portal.kernel.util.OrderByComparator<Sample>
				orderByComparator)
		throws NoSuchSampleException;

	/**
	 * Returns the first sample in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sample, or <code>null</code> if a matching sample could not be found
	 */
	public Sample fetchByField2_First(
		boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<Sample>
			orderByComparator);

	/**
	 * Returns the last sample in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sample
	 * @throws NoSuchSampleException if a matching sample could not be found
	 */
	public Sample findByField2_Last(
			boolean field2,
			com.liferay.portal.kernel.util.OrderByComparator<Sample>
				orderByComparator)
		throws NoSuchSampleException;

	/**
	 * Returns the last sample in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sample, or <code>null</code> if a matching sample could not be found
	 */
	public Sample fetchByField2_Last(
		boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<Sample>
			orderByComparator);

	/**
	 * Returns the samples before and after the current sample in the ordered set where field2 = &#63;.
	 *
	 * @param sampleId the primary key of the current sample
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sample
	 * @throws NoSuchSampleException if a sample with the primary key could not be found
	 */
	public Sample[] findByField2_PrevAndNext(
			long sampleId, boolean field2,
			com.liferay.portal.kernel.util.OrderByComparator<Sample>
				orderByComparator)
		throws NoSuchSampleException;

	/**
	 * Removes all the samples where field2 = &#63; from the database.
	 *
	 * @param field2 the field2
	 */
	public void removeByField2(boolean field2);

	/**
	 * Returns the number of samples where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @return the number of matching samples
	 */
	public int countByField2(boolean field2);

	/**
	 * Caches the sample in the entity cache if it is enabled.
	 *
	 * @param sample the sample
	 */
	public void cacheResult(Sample sample);

	/**
	 * Caches the samples in the entity cache if it is enabled.
	 *
	 * @param samples the samples
	 */
	public void cacheResult(java.util.List<Sample> samples);

	/**
	 * Creates a new sample with the primary key. Does not add the sample to the database.
	 *
	 * @param sampleId the primary key for the new sample
	 * @return the new sample
	 */
	public Sample create(long sampleId);

	/**
	 * Removes the sample with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sampleId the primary key of the sample
	 * @return the sample that was removed
	 * @throws NoSuchSampleException if a sample with the primary key could not be found
	 */
	public Sample remove(long sampleId) throws NoSuchSampleException;

	public Sample updateImpl(Sample sample);

	/**
	 * Returns the sample with the primary key or throws a <code>NoSuchSampleException</code> if it could not be found.
	 *
	 * @param sampleId the primary key of the sample
	 * @return the sample
	 * @throws NoSuchSampleException if a sample with the primary key could not be found
	 */
	public Sample findByPrimaryKey(long sampleId) throws NoSuchSampleException;

	/**
	 * Returns the sample with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sampleId the primary key of the sample
	 * @return the sample, or <code>null</code> if a sample with the primary key could not be found
	 */
	public Sample fetchByPrimaryKey(long sampleId);

	/**
	 * Returns all the samples.
	 *
	 * @return the samples
	 */
	public java.util.List<Sample> findAll();

	/**
	 * Returns a range of all the samples.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SampleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of samples
	 * @param end the upper bound of the range of samples (not inclusive)
	 * @return the range of samples
	 */
	public java.util.List<Sample> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the samples.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SampleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of samples
	 * @param end the upper bound of the range of samples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of samples
	 */
	public java.util.List<Sample> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Sample>
			orderByComparator);

	/**
	 * Returns an ordered range of all the samples.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SampleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of samples
	 * @param end the upper bound of the range of samples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of samples
	 */
	public java.util.List<Sample> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Sample>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the samples from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of samples.
	 *
	 * @return the number of samples
	 */
	public int countAll();

}