package com.sk.advanced.collections.set;

import java.util.*;

public class SetRunner {
    public static void main(String[] args) {

        List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');

//        HashSet : Neither insert order nor sorted order, but efficient for access and update
        Set<Character> characterHashSet = new HashSet<>(characters);
        characterHashSet.add('L');
        characterHashSet.add('X');
        characterHashSet.add('C');
        System.out.println("Hash Set : " + characterHashSet);

//        TreeSet - maintains natural sorted order
        Set<Character> characterTreeSet = new TreeSet<>(characters);
        characterTreeSet.add('L');
        characterTreeSet.add('X');
        characterTreeSet.add('C');
        System.out.println("Tree Set : " + characterTreeSet);

//        LinkedHashSet - maintains order of insertion
        Set<Character> characterLinkedHashSet = new LinkedHashSet<>(characters);
        characterLinkedHashSet.add('L');
        characterLinkedHashSet.add('X');
        characterLinkedHashSet.add('C');
        System.out.println("Linked Hash Set : " + characterLinkedHashSet);

        Queue<String> friends = new PriorityQueue<>();
        friends.offer("Monica");
        friends.offer("Ross");
        friends.offer("Joey");
        friends.offer("Chandler");
        System.out.println("Queue : " + friends);
        friends.poll();
        System.out.println("After Poll : " + friends);
        friends.poll();
        System.out.println("After second poll : " + friends);

//        Queue<Character> characterQueue = new PriorityQueue<>();
//        characterQueue.add('Z');
//        characterQueue.add('F');
//        characterQueue.add('C');
//        characterQueue.add('M');
//        System.out.println("Characters : " + characterQueue);
//        characterQueue.poll();
//        System.out.println("After Poll : " + characterQueue);
//        characterQueue.poll();
//        System.out.println("After second poll : " + characterQueue);


    }
}
