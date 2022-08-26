package day06.instructor;

public class _04_CssLocators_axis {
    /**
     * Child Elements
     * 1. Direct-child
     * 2. Sub-child
     * 3. Nth-child
     */

    public static void main(String[] args) {
        //1. direct-child
        // tag[attr=value] > tag
        // tag[attr=value] > tag[attr=value]

        //button[class='classValue'] > div[img='classValue'] > button[class='classValue']


        //2. Sub-child
        // tag[attr=value] tag
        // tag[attr=value] tag[attr=value]

        //button[class='classValue'] button[class='classValue']

        //3. nth-children
        //to access first child --> tag[attr=value]:first-child
        //to access last child --> tag[attr=value]:last-child
        //to access any child --> tag[attr=value]:nth-child(3)
        //div#parent2-child3 > div.sub-child:nth-child(5)



    }
}
