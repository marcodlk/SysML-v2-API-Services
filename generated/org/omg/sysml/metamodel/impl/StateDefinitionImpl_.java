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
import org.omg.sysml.metamodel.CalculationUsage;
import org.omg.sysml.metamodel.CaseUsage;
import org.omg.sysml.metamodel.Comment;
import org.omg.sysml.metamodel.ConnectionUsage;
import org.omg.sysml.metamodel.ConstraintUsage;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.Generalization;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.IndividualUsage;
import org.omg.sysml.metamodel.InterfaceUsage;
import org.omg.sysml.metamodel.ItemUsage;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.PartUsage;
import org.omg.sysml.metamodel.PortUsage;
import org.omg.sysml.metamodel.ReferenceUsage;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.RenderingUsage;
import org.omg.sysml.metamodel.RequirementUsage;
import org.omg.sysml.metamodel.StateUsage;
import org.omg.sysml.metamodel.Step;
import org.omg.sysml.metamodel.Superclassing;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.TransitionUsage;
import org.omg.sysml.metamodel.Usage;
import org.omg.sysml.metamodel.VariantMembership;
import org.omg.sysml.metamodel.VerificationCaseUsage;
import org.omg.sysml.metamodel.ViewUsage;
import org.omg.sysml.metamodel.ViewpointUsage;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(StateDefinitionImpl.class)
public abstract class StateDefinitionImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile CollectionAttribute<StateDefinitionImpl, PortUsage> ownedPort;
	public static volatile ListAttribute<StateDefinitionImpl, Generalization> ownedGeneralization;
	public static volatile SingularAttribute<StateDefinitionImpl, Boolean> isConjugated;
	public static volatile CollectionAttribute<StateDefinitionImpl, VerificationCaseUsage> ownedVerificationCase;
	public static volatile CollectionAttribute<StateDefinitionImpl, Usage> usage;
	public static volatile CollectionAttribute<StateDefinitionImpl, ViewpointUsage> ownedViewpoint;
	public static volatile CollectionAttribute<StateDefinitionImpl, AnalysisCaseUsage> ownedAnalysisCase;
	public static volatile CollectionAttribute<StateDefinitionImpl, RenderingUsage> ownedRendering;
	public static volatile CollectionAttribute<StateDefinitionImpl, ConstraintUsage> ownedConstraint;
	public static volatile CollectionAttribute<StateDefinitionImpl, Feature> output;
	public static volatile CollectionAttribute<StateDefinitionImpl, Usage> variant;
	public static volatile CollectionAttribute<StateDefinitionImpl, ActionUsage> action;
	public static volatile CollectionAttribute<StateDefinitionImpl, IndividualUsage> ownedIndividual;
	public static volatile CollectionAttribute<StateDefinitionImpl, ItemUsage> ownedItem;
	public static volatile CollectionAttribute<StateDefinitionImpl, StateUsage> state;
	public static volatile SingularAttribute<StateDefinitionImpl, Boolean> isSufficient;
	public static volatile CollectionAttribute<StateDefinitionImpl, Comment> documentationComment;
	public static volatile SingularAttribute<StateDefinitionImpl, UUID> identifier;
	public static volatile CollectionAttribute<StateDefinitionImpl, Annotation> ownedAnnotation;
	public static volatile CollectionAttribute<StateDefinitionImpl, ViewUsage> ownedView;
	public static volatile CollectionAttribute<StateDefinitionImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<StateDefinitionImpl, Usage> flowFeature;
	public static volatile CollectionAttribute<StateDefinitionImpl, Documentation> documentation;
	public static volatile CollectionAttribute<StateDefinitionImpl, Feature> endFeature;
	public static volatile CollectionAttribute<StateDefinitionImpl, InterfaceUsage> ownedInterface;
	public static volatile CollectionAttribute<StateDefinitionImpl, Feature> input;
	public static volatile CollectionAttribute<StateDefinitionImpl, ActionUsage> ownedAction;
	public static volatile CollectionAttribute<StateDefinitionImpl, CaseUsage> ownedCase;
	public static volatile CollectionAttribute<StateDefinitionImpl, CalculationUsage> ownedCalculation;
	public static volatile SingularAttribute<StateDefinitionImpl, String> name;
	public static volatile CollectionAttribute<StateDefinitionImpl, ReferenceUsage> ownedReference;
	public static volatile CollectionAttribute<StateDefinitionImpl, Usage> ownedUsage;
	public static volatile ListAttribute<StateDefinitionImpl, Element> ownedMember;
	public static volatile ListAttribute<StateDefinitionImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<StateDefinitionImpl, StateUsage> ownedState;
	public static volatile ListAttribute<StateDefinitionImpl, Membership> membership;
	public static volatile CollectionAttribute<StateDefinitionImpl, Superclassing> ownedSuperclassing;
	public static volatile SingularAttribute<StateDefinitionImpl, Boolean> isVariation;
	public static volatile CollectionAttribute<StateDefinitionImpl, Feature> feature;
	public static volatile ListAttribute<StateDefinitionImpl, Membership> inheritedMembership;
	public static volatile CollectionAttribute<StateDefinitionImpl, Feature> parameter;
	public static volatile ListAttribute<StateDefinitionImpl, Element> member;
	public static volatile CollectionAttribute<StateDefinitionImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<StateDefinitionImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<StateDefinitionImpl, Feature> inheritedFeature;
	public static volatile CollectionAttribute<StateDefinitionImpl, TransitionUsage> ownedTransition;
	public static volatile ListAttribute<StateDefinitionImpl, Membership> importedMembership;
	public static volatile CollectionAttribute<StateDefinitionImpl, Element> ownedElement;
	public static volatile ListAttribute<StateDefinitionImpl, Relationship> ownedRelationship;
	public static volatile CollectionAttribute<StateDefinitionImpl, ConnectionUsage> ownedConnection;
	public static volatile ListAttribute<StateDefinitionImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<StateDefinitionImpl, Import> ownedImport;
	public static volatile CollectionAttribute<StateDefinitionImpl, RequirementUsage> ownedRequirement;
	public static volatile SingularAttribute<StateDefinitionImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<StateDefinitionImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile CollectionAttribute<StateDefinitionImpl, VariantMembership> variantMembership;
	public static volatile SingularAttribute<StateDefinitionImpl, String> humanId;
	public static volatile CollectionAttribute<StateDefinitionImpl, String> aliasId;
	public static volatile CollectionAttribute<StateDefinitionImpl, Step> step;
	public static volatile CollectionAttribute<StateDefinitionImpl, AttributeUsage> ownedAttribute;
	public static volatile CollectionAttribute<StateDefinitionImpl, PartUsage> ownedPart;

	public static final String OWNED_PORT = "ownedPort";
	public static final String OWNED_GENERALIZATION = "ownedGeneralization";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String OWNED_VERIFICATION_CASE = "ownedVerificationCase";
	public static final String USAGE = "usage";
	public static final String OWNED_VIEWPOINT = "ownedViewpoint";
	public static final String OWNED_ANALYSIS_CASE = "ownedAnalysisCase";
	public static final String OWNED_RENDERING = "ownedRendering";
	public static final String OWNED_CONSTRAINT = "ownedConstraint";
	public static final String OUTPUT = "output";
	public static final String VARIANT = "variant";
	public static final String ACTION = "action";
	public static final String OWNED_INDIVIDUAL = "ownedIndividual";
	public static final String OWNED_ITEM = "ownedItem";
	public static final String STATE = "state";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String DOCUMENTATION_COMMENT = "documentationComment";
	public static final String IDENTIFIER = "identifier";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String OWNED_VIEW = "ownedView";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String FLOW_FEATURE = "flowFeature";
	public static final String DOCUMENTATION = "documentation";
	public static final String END_FEATURE = "endFeature";
	public static final String OWNED_INTERFACE = "ownedInterface";
	public static final String INPUT = "input";
	public static final String OWNED_ACTION = "ownedAction";
	public static final String OWNED_CASE = "ownedCase";
	public static final String OWNED_CALCULATION = "ownedCalculation";
	public static final String NAME = "name";
	public static final String OWNED_REFERENCE = "ownedReference";
	public static final String OWNED_USAGE = "ownedUsage";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String OWNED_STATE = "ownedState";
	public static final String MEMBERSHIP = "membership";
	public static final String OWNED_SUPERCLASSING = "ownedSuperclassing";
	public static final String IS_VARIATION = "isVariation";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String PARAMETER = "parameter";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String OWNED_TRANSITION = "ownedTransition";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String OWNED_CONNECTION = "ownedConnection";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String OWNED_REQUIREMENT = "ownedRequirement";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String OWNED_TEXTUAL_REPRESENTATION = "ownedTextualRepresentation";
	public static final String VARIANT_MEMBERSHIP = "variantMembership";
	public static final String HUMAN_ID = "humanId";
	public static final String ALIAS_ID = "aliasId";
	public static final String STEP = "step";
	public static final String OWNED_ATTRIBUTE = "ownedAttribute";
	public static final String OWNED_PART = "ownedPart";

}

