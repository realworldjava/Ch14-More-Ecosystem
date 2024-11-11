package com.wiley.realworldjava.more;

import java.util.HashSet;
import java.util.Set;

/**
 * An object that contains information about
 * topics the reader may want to learn.
 *
 * <p><b>There is a lot more to learn!</b>
 * To use:
 * {@snippet lang = java:
 *      Learning learning = new Learning();
 *      learning.addTopic("Docker");
 * }</p>
 */

public class Learning {

    private Set<String> topics;

    /**
     * Creates a new Learning object
     */
    public Learning() {
        topics = new HashSet<>();
    }

    /**
     * Stores a topic the reader wishes to learn.
     *
     * @param topic the name of the topic to learn
     * @return {@code true} if this topic was not already stored
     */
    public boolean addTopic(String topic) {
        return topics.add(topic);
    }
}
