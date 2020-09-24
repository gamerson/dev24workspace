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

package sample.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SampleLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SampleLocalService
 * @generated
 */
public class SampleLocalServiceWrapper
	implements SampleLocalService, ServiceWrapper<SampleLocalService> {

	public SampleLocalServiceWrapper(SampleLocalService sampleLocalService) {
		_sampleLocalService = sampleLocalService;
	}

	/**
	 * Adds the sample to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SampleLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sample the sample
	 * @return the sample that was added
	 */
	@Override
	public sample.model.Sample addSample(sample.model.Sample sample) {
		return _sampleLocalService.addSample(sample);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sampleLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new sample with the primary key. Does not add the sample to the database.
	 *
	 * @param sampleId the primary key for the new sample
	 * @return the new sample
	 */
	@Override
	public sample.model.Sample createSample(long sampleId) {
		return _sampleLocalService.createSample(sampleId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sampleLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the sample with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SampleLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sampleId the primary key of the sample
	 * @return the sample that was removed
	 * @throws PortalException if a sample with the primary key could not be found
	 */
	@Override
	public sample.model.Sample deleteSample(long sampleId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sampleLocalService.deleteSample(sampleId);
	}

	/**
	 * Deletes the sample from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SampleLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sample the sample
	 * @return the sample that was removed
	 */
	@Override
	public sample.model.Sample deleteSample(sample.model.Sample sample) {
		return _sampleLocalService.deleteSample(sample);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sampleLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _sampleLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>sample.model.impl.SampleModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _sampleLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>sample.model.impl.SampleModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _sampleLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _sampleLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _sampleLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public sample.model.Sample fetchSample(long sampleId) {
		return _sampleLocalService.fetchSample(sampleId);
	}

	/**
	 * Returns the sample matching the UUID and group.
	 *
	 * @param uuid the sample's UUID
	 * @param groupId the primary key of the group
	 * @return the matching sample, or <code>null</code> if a matching sample could not be found
	 */
	@Override
	public sample.model.Sample fetchSampleByUuidAndGroupId(
		String uuid, long groupId) {

		return _sampleLocalService.fetchSampleByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sampleLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _sampleLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sampleLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sampleLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sampleLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the sample with the primary key.
	 *
	 * @param sampleId the primary key of the sample
	 * @return the sample
	 * @throws PortalException if a sample with the primary key could not be found
	 */
	@Override
	public sample.model.Sample getSample(long sampleId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sampleLocalService.getSample(sampleId);
	}

	/**
	 * Returns the sample matching the UUID and group.
	 *
	 * @param uuid the sample's UUID
	 * @param groupId the primary key of the group
	 * @return the matching sample
	 * @throws PortalException if a matching sample could not be found
	 */
	@Override
	public sample.model.Sample getSampleByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sampleLocalService.getSampleByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the samples.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>sample.model.impl.SampleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of samples
	 * @param end the upper bound of the range of samples (not inclusive)
	 * @return the range of samples
	 */
	@Override
	public java.util.List<sample.model.Sample> getSamples(int start, int end) {
		return _sampleLocalService.getSamples(start, end);
	}

	/**
	 * Returns all the samples matching the UUID and company.
	 *
	 * @param uuid the UUID of the samples
	 * @param companyId the primary key of the company
	 * @return the matching samples, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<sample.model.Sample> getSamplesByUuidAndCompanyId(
		String uuid, long companyId) {

		return _sampleLocalService.getSamplesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of samples matching the UUID and company.
	 *
	 * @param uuid the UUID of the samples
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of samples
	 * @param end the upper bound of the range of samples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching samples, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<sample.model.Sample> getSamplesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<sample.model.Sample>
			orderByComparator) {

		return _sampleLocalService.getSamplesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of samples.
	 *
	 * @return the number of samples
	 */
	@Override
	public int getSamplesCount() {
		return _sampleLocalService.getSamplesCount();
	}

	/**
	 * Updates the sample in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SampleLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sample the sample
	 * @return the sample that was updated
	 */
	@Override
	public sample.model.Sample updateSample(sample.model.Sample sample) {
		return _sampleLocalService.updateSample(sample);
	}

	@Override
	public SampleLocalService getWrappedService() {
		return _sampleLocalService;
	}

	@Override
	public void setWrappedService(SampleLocalService sampleLocalService) {
		_sampleLocalService = sampleLocalService;
	}

	private SampleLocalService _sampleLocalService;

}