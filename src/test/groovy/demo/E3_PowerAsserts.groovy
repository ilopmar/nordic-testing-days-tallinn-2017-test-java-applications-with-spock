package demo

import spock.lang.Specification

class E3_PowerAsserts extends Specification {

    void 'should fail with numbers'() {
        expect:
            2 * 3 == 5 * 4
    }

    void 'should fail with maps and lists'() {
        given:
            def data = [
                name  : 'Iván',
                age   : 37,
                childs: [
                    [name: 'Judith', age: 9], [name: 'Adriana', age: 6]
                ]
            ]

        expect:
            data.childs.name.first() == 'Adriana'
    }

}
