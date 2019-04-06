package io.github.oliviercailloux.y2018.jbiblio.j_biblio.servlets;

import java.util.List;
import java.util.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.lang3.StringUtils;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.Item;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.work.Work;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.services.ItemService;

@RequestScoped
@Path("item")
public class ItemJsonServlet {

	private static final Logger LOGGER = Logger.getLogger(ItemJsonServlet.class.getCanonicalName());

	@PersistenceContext
	private EntityManager em;

	@Inject
	private ItemService itemService;

	@GET
	@Transactional
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces("application/json")
	public List<Item> getItemsServlet(@QueryParam("itemIdentifier") String itemIdentifier,
			@QueryParam("fingerprint") String fingerprint) {

		final List<Item> itemsList;
		/**
		 * Checks if both parameters are empty otherwise we select all work in the
		 * work's table
		 */
		if (!StringUtils.isBlank(itemIdentifier) || !StringUtils.isBlank(fingerprint)) {
			itemsList = itemService.findByField(itemIdentifier, fingerprint);
		} else {
			itemsList = itemService.getAll();
		}

		return itemsList;
	}

	@POST
	@Transactional
	@Consumes("application/json")
	public Response addItemServlet(Item item) {
		em.persist(item);
		LOGGER.info("Item added!");
		return Response.status(Response.Status.OK).build();
	}

}
