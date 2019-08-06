package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.Category;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.EndFeatureMembership;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.Generalization;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.Superclassing;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AssociationImpl.class)
public abstract class AssociationImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile ListAttribute<AssociationImpl, Generalization> ownedGeneralization;
	public static volatile ListAttribute<AssociationImpl, EndFeatureMembership> ownedEndFeatureMembership;
	public static volatile CollectionAttribute<AssociationImpl, Superclassing> ownedSuperclassing;
	public static volatile CollectionAttribute<AssociationImpl, Element> ownedRelatedElement;
	public static volatile CollectionAttribute<AssociationImpl, Element> source;
	public static volatile ListAttribute<AssociationImpl, Membership> membership;
	public static volatile CollectionAttribute<AssociationImpl, Feature> output;
	public static volatile CollectionAttribute<AssociationImpl, Category> relatedType;
	public static volatile CollectionAttribute<AssociationImpl, Feature> feature;
	public static volatile ListAttribute<AssociationImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<AssociationImpl, Element> member;
	public static volatile ListAttribute<AssociationImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile ListAttribute<AssociationImpl, Membership> importedMembership;
	public static volatile SingularAttribute<AssociationImpl, UUID> identifier;
	public static volatile CollectionAttribute<AssociationImpl, Element> ownedElement;
	public static volatile CollectionAttribute<AssociationImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<AssociationImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<AssociationImpl, Import> ownedImport;
	public static volatile SingularAttribute<AssociationImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<AssociationImpl, Element> target;
	public static volatile CollectionAttribute<AssociationImpl, Feature> input;
	public static volatile CollectionAttribute<AssociationImpl, Element> relatedElement;
	public static volatile SingularAttribute<AssociationImpl, String> name;
	public static volatile ListAttribute<AssociationImpl, Element> ownedMember;
	public static volatile ListAttribute<AssociationImpl, Membership> ownedMembership;

	public static final String OWNED_GENERALIZATION = "ownedGeneralization";
	public static final String OWNED_END_FEATURE_MEMBERSHIP = "ownedEndFeatureMembership";
	public static final String OWNED_SUPERCLASSING = "ownedSuperclassing";
	public static final String OWNED_RELATED_ELEMENT = "ownedRelatedElement";
	public static final String SOURCE = "source";
	public static final String MEMBERSHIP = "membership";
	public static final String OUTPUT = "output";
	public static final String RELATED_TYPE = "relatedType";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String MEMBER = "member";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String IDENTIFIER = "identifier";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String TARGET = "target";
	public static final String INPUT = "input";
	public static final String RELATED_ELEMENT = "relatedElement";
	public static final String NAME = "name";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";

}

