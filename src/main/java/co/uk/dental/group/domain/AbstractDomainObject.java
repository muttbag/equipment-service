package co.uk.dental.group.domain;

import org.apache.commons.lang3.builder.HashCodeBuilder;

public class AbstractDomainObject {

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public String toString() {
//        StringBuilder.
	return null;
    }

    @Override
    public boolean equals(Object obj) {
	return true;
    }
}
