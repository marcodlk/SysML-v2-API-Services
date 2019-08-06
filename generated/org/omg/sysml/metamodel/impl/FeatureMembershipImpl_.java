package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.FeatureDirectionKind;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.VisibilityKind;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FeatureMembershipImpl.class)
public abstract class FeatureMembershipImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile SingularAttribute<FeatureMembershipImpl, UUID> identifier;
	public static volatile SingularAttribute<FeatureMembershipImpl, Boolean> isDerived;
	public static volatile CollectionAttribute<FeatureMembershipImpl, Element> ownedElement;
	public static volatile CollectionAttribute<FeatureMembershipImpl, String> aliases;
	public static volatile SingularAttribute<FeatureMembershipImpl, VisibilityKind> visibility;
	public static volatile CollectionAttribute<FeatureMembershipImpl, Relationship> ownedRelationship;
	public static volatile SingularAttribute<FeatureMembershipImpl, String> memberName;
	public static volatile CollectionAttribute<FeatureMembershipImpl, Element> ownedRelatedElement;
	public static volatile CollectionAttribute<FeatureMembershipImpl, Element> source;
	public static volatile SingularAttribute<FeatureMembershipImpl, Boolean> isPort;
	public static volatile CollectionAttribute<FeatureMembershipImpl, Element> target;
	public static volatile SingularAttribute<FeatureMembershipImpl, Boolean> isReadOnly;
	public static volatile CollectionAttribute<FeatureMembershipImpl, Element> relatedElement;
	public static volatile SingularAttribute<FeatureMembershipImpl, String> name;
	public static volatile SingularAttribute<FeatureMembershipImpl, Boolean> isPart;
	public static volatile SingularAttribute<FeatureMembershipImpl, FeatureDirectionKind> direction;

	public static final String IDENTIFIER = "identifier";
	public static final String IS_DERIVED = "isDerived";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String ALIASES = "aliases";
	public static final String VISIBILITY = "visibility";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String MEMBER_NAME = "memberName";
	public static final String OWNED_RELATED_ELEMENT = "ownedRelatedElement";
	public static final String SOURCE = "source";
	public static final String IS_PORT = "isPort";
	public static final String TARGET = "target";
	public static final String IS_READ_ONLY = "isReadOnly";
	public static final String RELATED_ELEMENT = "relatedElement";
	public static final String NAME = "name";
	public static final String IS_PART = "isPart";
	public static final String DIRECTION = "direction";

}

