package com.ociweb

class AbstractDomainThing extends AbstractDomain  {

    Integer thingProp
    //TODO: This works, if the validator is removed: Integer thingPropFromInherited = INHERITED_MIN

    static constraints = {
        thingProp(min: INHERITED_MIN, max: INHERITED_MAX)
    }

}
