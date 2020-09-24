package sample.web.portlet;

import cern.colt.Timer;
import com.fasterxml.jackson.core.JsonFactory;
import org.osgi.service.component.annotations.Reference;
import sample.service.SampleLocalService;
import sample.web.constants.SampleWebPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author greg
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=SampleWeb",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + SampleWebPortletKeys.SAMPLEWEB,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class SampleWebPortlet extends MVCPortlet {

	@Reference
	SampleLocalService _sampleLocalService;

	Timer timer = new Timer();

	JsonFactory jsonFactory = new JsonFactory();

}