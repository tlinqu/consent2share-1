package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="ActRelationshipObjective")
@XmlEnum
public enum ActRelationshipObjective
{
  OBJC, 
  OBJF;

  public String value() {
    return name();
  }

  public static ActRelationshipObjective fromValue(String v) {
    return valueOf(v);
  }
}

