package io.github.oliviercailloux.y2018.jbiblio.j_biblio.servlets;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.Item;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.Manifestation;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.services.ItemService;

@RequestScoped
@Path("item")
public class ItemJsonServlet extends HttpServlet {
	@SuppressWarnings("unused")
	private static final Logger LOGGER = Logger.getLogger(ItemJsonServlet.class.getCanonicalName());

	@PersistenceContext
	private EntityManager em;

	@Inject
	private HttpServletRequest request;


	@Inject
	private ItemService itemService;

	@GET
	@Transactional
	@Produces("application/json")
	public List<Item> getItemsServlet() {

		List<Item> items = itemService.getAll();
		return items;
	}

	@POST
	@Transactional
	@Consumes("application/json")
	public Response addItemServlet(Item item) throws IOException {
		em.persist(item);
		LOGGER.info("Item added!");
		return Response.status(Response.Status.OK).build();
	}

}
