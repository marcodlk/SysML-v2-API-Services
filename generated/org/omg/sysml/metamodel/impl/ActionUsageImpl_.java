package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.ActionUsage;
import org.omg.sysml.metamodel.AnalysisCaseUsage;
import org.omg.sysml.metamodel.Annotation;
import org.omg.sysml.metamodel.AttributeUsage;
import org.omg.sysml.metamodel.Behavior;
import org.omg.sysml.metamodel.CalculationUsage;
import org.omg.sysml.metamodel.CaseUsage;
import org.omg.sysml.metamodel.Comment;
import org.omg.sysml.metamodel.ConnectionUsage;
import org.omg.sysml.metamodel.ConstraintUsage;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FeatureTyping;
import org.omg.sysml.metamodel.Generalization;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.IndividualUsage;
import org.omg.sysml.metamodel.InterfaceUsage;
import org.omg.sysml.metamodel.ItemUsage;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.PartUsage;
import org.omg.sysml.metamodel.PortUsage;
import org.omg.sysml.metamodel.Redefinition;
import org.omg.sysml.metamodel.ReferenceUsage;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.RenderingUsage;
import org.omg.sysml.metamodel.RequirementUsage;
import org.omg.sysml.metamodel.StateUsage;
import org.omg.sysml.metamodel.Subsetting;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.TransitionUsage;
import org.omg.sysml.metamodel.Type;
import org.omg.sysml.metamodel.Usage;
import org.omg.sysml.metamodel.VariantMembership;
import org.omg.sysml.metamodel.VerificationCaseUsage;
import org.omg.sysml.metamodel.ViewUsage;
import org.omg.sysml.metamodel.ViewpointUsage;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ActionUsageImpl.class)
public abstract class ActionUsageImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile ListAttribute<ActionUsageImpl, Generalization> ownedGeneralization;
	public static volatile CollectionAttribute<ActionUsageImpl, PartUsage> nestedPart;
	public static volatile SingularAttribute<ActionUsageImpl, Boolean> isConjugated;
	public static volatile CollectionAttribute<ActionUsageImpl, Usage> usage;
	public static volatile SingularAttribute<ActionUsageImpl, Boolean> isUnique;
	public static volatile CollectionAttribute<ActionUsageImpl, Usage> nestedUsage;
	public static volatile CollectionAttribute<ActionUsageImpl, Subsetting> ownedSubsetting;
	public static volatile CollectionAttribute<ActionUsageImpl, Type> type;
	public static volatile CollectionAttribute<ActionUsageImpl, RequirementUsage> nestedRequirement;
	public static volatile CollectionAttribute<ActionUsageImpl, Feature> output;
	public static volatile CollectionAttribute<ActionUsageImpl, PortUsage> nestedPort;
	public static volatile CollectionAttribute<ActionUsageImpl, TransitionUsage> nestedTransition;
	public static volatile CollectionAttribute<ActionUsageImpl, ConstraintUsage> nestedConstraint;
	public static volatile CollectionAttribute<ActionUsageImpl, Usage> variant;
	public static volatile SingularAttribute<ActionUsageImpl, Boolean> isSufficient;
	public static volatile CollectionAttribute<ActionUsageImpl, StateUsage> nestedState;
	public static volatile CollectionAttribute<ActionUsageImpl, Comment> documentationComment;
	public static volatile SingularAttribute<ActionUsageImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<ActionUsageImpl, Redefinition> ownedRedefinition;
	public static volatile SingularAttribute<ActionUsageImpl, UUID> identifier;
	public static volatile CollectionAttribute<ActionUsageImpl, AttributeUsage> nestedAttribute;
	public static volatile CollectionAttribute<ActionUsageImpl, Annotation> ownedAnnotation;
	public static volatile CollectionAttribute<ActionUsageImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<ActionUsageImpl, Usage> flowFeature;
	public static volatile CollectionAttribute<ActionUsageImpl, Documentation> documentation;
	public static volatile CollectionAttribute<ActionUsageImpl, AnalysisCaseUsage> nestedAnalysisCase;
	public static volatile CollectionAttribute<ActionUsageImpl, VerificationCaseUsage> nestedVerificationCase;
	public static volatile CollectionAttribute<ActionUsageImpl, Feature> endFeature;
	public static volatile CollectionAttribute<ActionUsageImpl, Behavior> actionDefinition;
	public static volatile CollectionAttribute<ActionUsageImpl, Type> referencedType;
	public static volatile SingularAttribute<ActionUsageImpl, Boolean> isEnd;
	public static volatile CollectionAttribute<ActionUsageImpl, ItemUsage> nestedItem;
	public static volatile CollectionAttribute<ActionUsageImpl, Feature> input;
	public static volatile CollectionAttribute<ActionUsageImpl, CalculationUsage> nestedCalculation;
	public static volatile SingularAttribute<ActionUsageImpl, Boolean> isComposite;
	public static volatile CollectionAttribute<ActionUsageImpl, ViewUsage> nestedView;
	public static volatile CollectionAttribute<ActionUsageImpl, Type> ownedType;
	public static volatile SingularAttribute<ActionUsageImpl, String> name;
	public static volatile ListAttribute<ActionUsageImpl, Element> ownedMember;
	public static volatile ListAttribute<ActionUsageImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<ActionUsageImpl, CaseUsage> nestedCase;
	public static volatile CollectionAttribute<ActionUsageImpl, IndividualUsage> nestedIndividual;
	public static volatile ListAttribute<ActionUsageImpl, Membership> membership;
	public static volatile SingularAttribute<ActionUsageImpl, Boolean> isNonunique;
	public static volatile CollectionAttribute<ActionUsageImpl, ReferenceUsage> nestedReference;
	public static volatile SingularAttribute<ActionUsageImpl, Boolean> isVariation;
	public static volatile CollectionAttribute<ActionUsageImpl, FeatureTyping> ownedTyping;
	public static volatile CollectionAttribute<ActionUsageImpl, Feature> feature;
	public static volatile ListAttribute<ActionUsageImpl, Membership> inheritedMembership;
	public static volatile CollectionAttribute<ActionUsageImpl, Feature> parameter;
	public static volatile ListAttribute<ActionUsageImpl, Element> member;
	public static volatile CollectionAttribute<ActionUsageImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<ActionUsageImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<ActionUsageImpl, Feature> inheritedFeature;
	public static volatile CollectionAttribute<ActionUsageImpl, Behavior> behavior;
	public static volatile ListAttribute<ActionUsageImpl, Membership> importedMembership;
	public static volatile CollectionAttribute<ActionUsageImpl, Element> ownedElement;
	public static volatile CollectionAttribute<ActionUsageImpl, ActionUsage> nestedAction;
	public static volatile ListAttribute<ActionUsageImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<ActionUsageImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<ActionUsageImpl, Import> ownedImport;
	public static volatile SingularAttribute<ActionUsageImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<ActionUsageImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile CollectionAttribute<ActionUsageImpl, VariantMembership> variantMembership;
	public static volatile CollectionAttribute<ActionUsageImpl, RenderingUsage> nestedRendering;
	public static volatile SingularAttribute<ActionUsageImpl, String> humanId;
	public static volatile CollectionAttribute<ActionUsageImpl, ConnectionUsage> nestedConnection;
	public static volatile CollectionAttribute<ActionUsageImpl, String> aliasId;
	public static volatile CollectionAttribute<ActionUsageImpl, InterfaceUsage> nestedInterface;
	public static volatile CollectionAttribute<ActionUsageImpl, ViewpointUsage> nestedViewpoint;

	public static final String OWNED_GENERALIZATION = "ownedGeneralization";
	public static final String NESTED_PART = "nestedPart";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String USAGE = "usage";
	public static final String IS_UNIQUE = "isUnique";
	public static final String NESTED_USAGE = "nestedUsage";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String TYPE = "type";
	public static final String NESTED_REQUIREMENT = "nestedRequirement";
	public static final String OUTPUT = "output";
	public static final String NESTED_PORT = "nestedPort";
	public static final String NESTED_TRANSITION = "nestedTransition";
	public static final String NESTED_CONSTRAINT = "nestedConstraint";
	public static final String VARIANT = "variant";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String NESTED_STATE = "nestedState";
	public static final String DOCUMENTATION_COMMENT = "documentationComment";
	public static final String IS_ORDERED = "isOrdered";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String IDENTIFIER = "identifier";
	public static final String NESTED_ATTRIBUTE = "nestedAttribute";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String FLOW_FEATURE = "flowFeature";
	public static final String DOCUMENTATION = "documentation";
	public static final String NESTED_ANALYSIS_CASE = "nestedAnalysisCase";
	public static final String NESTED_VERIFICATION_CASE = "nestedVerificationCase";
	public static final String END_FEATURE = "endFeature";
	public static final String ACTION_DEFINITION = "actionDefinition";
	public static final String REFERENCED_TYPE = "referencedType";
	public static final String IS_END = "isEnd";
	public static final String NESTED_ITEM = "nestedItem";
	public static final String INPUT = "input";
	public static final String NESTED_CALCULATION = "nestedCalculation";
	public static final String IS_COMPOSITE = "isComposite";
	public static final String NESTED_VIEW = "nestedView";
	public static final String OWNED_TYPE = "ownedType";
	public static final String NAME = "name";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String NESTED_CASE = "nestedCase";
	public static final String NESTED_INDIVIDUAL = "nestedIndividual";
	public static final String MEMBERSHIP = "membership";
	public static final String IS_NONUNIQUE = "isNonunique";
	public static final String NESTED_REFERENCE = "nestedReference";
	public static final String IS_VARIATION = "isVariation";
	public static final String OWNED_TYPING = "ownedTyping";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String PARAMETER = "parameter";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String BEHAVIOR = "behavior";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String NESTED_ACTION = "nestedAction";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String OWNED_TEXTUAL_REPRESENTATION = "ownedTextualRepresentation";
	public static final String VARIANT_MEMBERSHIP = "variantMembership";
	public static final String NESTED_RENDERING = "nestedRendering";
	public static final String HUMAN_ID = "humanId";
	public static final String NESTED_CONNECTION = "nestedConnection";
	public static final String ALIAS_ID = "aliasId";
	public static final String NESTED_INTERFACE = "nestedInterface";
	public static final String NESTED_VIEWPOINT = "nestedViewpoint";

}

