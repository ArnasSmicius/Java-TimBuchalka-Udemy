package com.timbuchalka;

/**
 * Created by dev on 17/01/2016.
 */
public class Challenge {
    /**
     * When overriding the equals() method in the HeavenlyBody class, we
     * were careful to make sure that it would not return true if a HeavenlyBody
     * was compared to a subclass of itself.
     *
     * We did that to demonstrate that method, but it was actually
     * unnecessary in the HeavenlyBody class.
     *
     * The mini challenge is just a question: why was it unnecessary?
     *
     * Hint: If you are stuck, check out Lecture 97
     *
     * Answer:
     *
     * The HeavenlyBody class is declared final, so cannot be subclassed.
     * The Java String class is also final, which is why it can safely
     * use the instanceof method without having to worry about
     * comparisons with a subclass.

     *
     **/
}
