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
import javax.ws.rs.core.Response;

import org.apache.commons.lang3.StringUtils;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.expression.Expression;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.services.ExpressionService;

@RequestScoped
@Path("expression")
public class ExpressionServlet {

	private static final Logger LOGGER = Logger.getLogger(ExpressionServlet.class.getCanonicalName());

	@PersistenceContext
	private EntityManager em;

	@Inject
	private ExpressionService expressionService;

	@GET
	@Transactional
	@Produces({ "application/json" })
	public List<Expression> getExpressionsServlet(@QueryParam("formOfExpression") String formOfExpression,
			@QueryParam("languageOfExpression") String languageOfExpression) {

		final List<Expression> expressionsList;
		/**
		 * Checks if both parameters are empty otherwise we select all work in the
		 * work's table
		 */
		if (!StringUtils.isBlank(formOfExpression) || !StringUtils.isBlank(languageOfExpression)) {
			expressionsList = expressionService.findByField(formOfExpression, languageOfExpression);
		} else {
			expressionsList = expressionService.getAll();
		}

		return expressionsList;
	}

	@POST
	@Transactional
	@Consumes("application/json")
	public Response addExpressionServlet(Expression expression) {
		em.persist(expression);
		LOGGER.info("Expression added!");
		return Response.status(Response.Status.OK).build();
	}

}
