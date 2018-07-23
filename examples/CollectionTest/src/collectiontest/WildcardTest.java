/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiontest;

import java.util.List;

/**
 *
 * @author claudio
 */
public class WildcardTest<T> {

    // Accept T and all subtypes of T
    T something(List<? extends T> s) {
        // we can safely return an element of the list
        // because it is of type T or a subtype
        return s.get(0);
    }

}
