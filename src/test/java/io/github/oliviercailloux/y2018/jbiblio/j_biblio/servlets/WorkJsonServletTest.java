package io.github.oliviercailloux.y2018.jbiblio.j_biblio.servlets;

import static org.junit.Assert.assertEquals;

import java.net.URL;
import java.util.logging.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class WorkJsonServletTest {
	private static final Logger LOGGER = Logger.getLogger(WorkJsonServletTest.class.getCanonicalName());

	@Deployment(testable = false)
	public static WebArchive createDeployment() {
		final WebArchive war = ShrinkWrap.create(WebArchive.class, "jbiblio.war").addPackages(true,
				WorkJsonServletTest.class.getPackage());
		return war;
	}

	@ArquillianResource
	private URL baseURL;

	@Test
	public void testDoGet() throws Exception {
		final Client client = ClientBuilder.newClient();
		final WebTarget webTarget = client.target(baseURL.toString()).path("/work").queryParam("id", 1);
		LOGGER.info(webTarget.getUri().toString());
		final String response = webTarget.request(MediaType.APPLICATION_JSON).get(String.class);
		String str = "{\"idWork\":1,\"idExpressions\":[],\"otherDistinguishingCharacteristic\":[],\"intendedTermination\":[],\"intendedAudience\":[],\"contextForTheWork\":\"\",\"titleOfWork\":[],\"formOfWork\":\"toto\",\"expressions\":[{\"formOfExpression\":\"\",\"idExpression\":2,\"languageOfExpression\":\"\",\"idManifestations\":[],\"titleOfExpression\":[],\"dateOfExpression\":[],\"otherDistinguishingCharacteristic\":[]}],\"dateOfWork:[]}";

		assertEquals(str, response);
		client.close();
	}
}