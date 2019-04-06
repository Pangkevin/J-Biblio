package io.github.oliviercailloux.y2018.jbiblio.j_biblio.services;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.apache.commons.lang3.StringUtils;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.Manifestation;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.expression.Expression;

@RequestScoped
public class ExpressionService {
	@PersistenceContext
	private EntityManager em;

	@Inject
	private QueryHelper helper;

	@Transactional
	public List<Expression> getAll() {

		return em.createQuery(helper.selectAll(Expression.class)).getResultList();

	}

	@Transactional
	public void persist(Expression expression) {

		em.persist(expression);
	}

	public List<Expression> findByField(String formOfExpression, String languageOfExpression) {
		final CriteriaBuilder cb = em.getCriteriaBuilder();
		final CriteriaQuery<Expression> cq = cb.createQuery(Expression.class);
		final Root<Expression> e = cq.from(Expression.class);
		if (!StringUtils.isBlank(formOfExpression)) {
			cq.where(cb.like(e.get("formOfExpression"), formOfExpression));
		}
		if (!StringUtils.isBlank(languageOfExpression)) {
			cq.where(cb.like(e.get("languageOfExpression"), languageOfExpression));
		}

		return em.createQuery(cq).getResultList();

	}
}
