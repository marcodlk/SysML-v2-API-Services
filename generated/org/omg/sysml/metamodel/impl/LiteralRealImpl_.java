package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.Category;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FeatureTyping;
import org.omg.sysml.metamodel.Function;
import org.omg.sysml.metamodel.Generalization;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.Redefinition;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.Subsetting;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(LiteralRealImpl.class)
public abstract class LiteralRealImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile ListAttribute<LiteralRealImpl, Generalization> ownedGeneralization;
	public static volatile CollectionAttribute<LiteralRealImpl, Subsetting> ownedSubsetting;
	public static volatile SingularAttribute<LiteralRealImpl, Boolean> isUnique;
	public static volatile ListAttribute<LiteralRealImpl, Membership> membership;
	public static volatile CollectionAttribute<LiteralRealImpl, Function> type;
	public static volatile SingularAttribute<LiteralRealImpl, Boolean> isNonunique;
	public static volatile CollectionAttribute<LiteralRealImpl, Feature> output;
	public static volatile CollectionAttribute<LiteralRealImpl, Feature> feature;
	public static volatile ListAttribute<LiteralRealImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<LiteralRealImpl, Element> member;
	public static volatile ListAttribute<LiteralRealImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile SingularAttribute<LiteralRealImpl, Double> value;
	public static volatile SingularAttribute<LiteralRealImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<LiteralRealImpl, Redefinition> ownedRedefinition;
	public static volatile ListAttribute<LiteralRealImpl, Membership> importedMembership;
	public static volatile SingularAttribute<LiteralRealImpl, UUID> identifier;
	public static volatile CollectionAttribute<LiteralRealImpl, Element> ownedElement;
	public static volatile CollectionAttribute<LiteralRealImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<LiteralRealImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<LiteralRealImpl, Import> ownedImport;
	public static volatile CollectionAttribute<LiteralRealImpl, Category> referencedType;
	public static volatile SingularAttribute<LiteralRealImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<LiteralRealImpl, Feature> input;
	public static volatile SingularAttribute<LiteralRealImpl, Boolean> isComposite;
	public static volatile CollectionAttribute<LiteralRealImpl, Category> ownedType;
	public static volatile SingularAttribute<LiteralRealImpl, String> name;
	public static volatile CollectionAttribute<LiteralRealImpl, FeatureTyping> typing;
	public static volatile ListAttribute<LiteralRealImpl, Element> ownedMember;
	public static volatile ListAttribute<LiteralRealImpl, Membership> ownedMembership;

	public static final String OWNED_GENERALIZATION = "ownedGeneralization";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String IS_UNIQUE = "isUnique";
	public static final String MEMBERSHIP = "membership";
	public static final String TYPE = "type";
	public static final String IS_NONUNIQUE = "isNonunique";
	public static final String OUTPUT = "output";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String MEMBER = "member";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String VALUE = "value";
	public static final String IS_ORDERED = "isOrdered";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String IDENTIFIER = "identifier";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String REFERENCED_TYPE = "referencedType";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String INPUT = "input";
	public static final String IS_COMPOSITE = "isComposite";
	public static final String OWNED_TYPE = "ownedType";
	public static final String NAME = "name";
	public static final String TYPING = "typing";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";

}

