package org.omg.sysml.metamodel.impl;

import org.omg.sysml.metamodel.*;
import org.omg.sysml.metamodel.Package;
import org.omg.sysml.metamodel.*;

import jackson.MofObjectSerializer;
import jackson.MofObjectDeserializer;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import org.hibernate.annotations.Any;
import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.FetchMode;

// import info.archinnov.achilles.annotations.UDT;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.FetchType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.SecondaryTable;

import java.util.Collection;
import java.util.ArrayList;

@Entity(name = "ElementImpl")
@SecondaryTable(name = "Element")
@org.hibernate.annotations.Table(appliesTo = "Element", fetch = FetchMode.SELECT, optional = false)
// @info.archinnov.achilles.annotations.Table(table = "Element")
@DiscriminatorValue(value = "Element")
@JsonTypeName(value = "Element")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME)
public class ElementImpl extends MofObjectImpl implements Element {
    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("owningMembership")
    private Membership owningMembership;

    @JsonProperty(required = true)
    @JsonGetter
    @JsonSerialize(using = MofObjectSerializer.class)
    @javax.persistence.Transient
    public Membership getOwningMembership() {
        return owningMembership;
    }

    @JsonProperty(required = true)
    @JsonSetter
    @JsonDeserialize(using = MofObjectDeserializer.class, as = MembershipImpl.class)
    public void setOwningMembership(Membership owningMembership) {
        this.owningMembership = owningMembership;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("owningNamespace")
    private Package owningNamespace;

    @JsonProperty(required = true)
    @JsonGetter
    @JsonSerialize(using = MofObjectSerializer.class)
    @javax.persistence.Transient
    public Package getOwningNamespace() {
        return owningNamespace;
    }

    @JsonProperty(required = true)
    @JsonSetter
    @JsonDeserialize(using = MofObjectDeserializer.class, as = PackageImpl.class)
    public void setOwningNamespace(Package owningNamespace) {
        this.owningNamespace = owningNamespace;
    }



    // @info.archinnov.achilles.annotations.Column("owningRelationship")
    private Relationship owningRelationship;

    @JsonProperty(required = true)
    @JsonGetter
    @JsonSerialize(using = MofObjectSerializer.class)
    @Any(metaDef = "RelationshipMetaDef", metaColumn = @javax.persistence.Column(name = "owningRelationshipType"), fetch = FetchType.LAZY)
    @JoinColumn(name = "owningRelationshipId", table = "Element")
    public Relationship getOwningRelationship() {
        return owningRelationship;
    }

    @JsonProperty(required = true)
    @JsonSetter
    @JsonDeserialize(using = MofObjectDeserializer.class, as = RelationshipImpl.class)
    public void setOwningRelationship(Relationship owningRelationship) {
        this.owningRelationship = owningRelationship;
    }



    // @info.archinnov.achilles.annotations.Column("identifier")
    private java.util.UUID identifier;

    @JsonProperty(required = true)
    @JsonGetter
    public java.util.UUID getIdentifier() {
        return identifier;
    }

    @JsonProperty(required = true)
    @JsonSetter
    public void setIdentifier(java.util.UUID identifier) {
        this.identifier = identifier;
    }



    // @info.archinnov.achilles.annotations.Column("ownedRelationship")
    private Collection<Relationship> ownedRelationship;

    @JsonProperty(required = true)
    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    @ManyToAny(metaDef = "RelationshipMetaDef", metaColumn = @javax.persistence.Column(name = "ownedRelationshipType"), fetch = FetchType.LAZY)
    @JoinTable(name = "Element_ownedRelationship",
            joinColumns = @JoinColumn(name = "ElementId"),
            inverseJoinColumns = @JoinColumn(name = "ownedRelationshipId"))
    public Collection<Relationship> getOwnedRelationship() {
        if (ownedRelationship == null) {
            ownedRelationship = new ArrayList<>();
        }
        return ownedRelationship;
    }

    @JsonProperty(required = true)
    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = RelationshipImpl.class)
    public void setOwnedRelationship(Collection<Relationship> ownedRelationship) {
        this.ownedRelationship = ownedRelationship;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("name")
    private String name;

    @JsonProperty(required = true)
    @JsonGetter
    @Lob
    @org.hibernate.annotations.Type(type = "org.hibernate.type.TextType")
    @javax.persistence.Transient
    public String getName() {
        return name;
    }

    @JsonProperty(required = true)
    @JsonSetter
    public void setName(String name) {
        this.name = name;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("ownedElement")
    private Collection<Element> ownedElement;

    @JsonProperty(required = true)
    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    @javax.persistence.Transient
    public Collection<Element> getOwnedElement() {
        if (ownedElement == null) {
            ownedElement = new ArrayList<>();
        }
        return ownedElement;
    }

    @JsonProperty(required = true)
    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = ElementImpl.class)
    public void setOwnedElement(Collection<Element> ownedElement) {
        this.ownedElement = ownedElement;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("owner")
    private Element owner;

    @JsonProperty(required = true)
    @JsonGetter
    @JsonSerialize(using = MofObjectSerializer.class)
    @javax.persistence.Transient
    public Element getOwner() {
        return owner;
    }

    @JsonProperty(required = true)
    @JsonSetter
    @JsonDeserialize(using = MofObjectDeserializer.class, as = ElementImpl.class)
    public void setOwner(Element owner) {
        this.owner = owner;
    }



}
