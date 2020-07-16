package trie_lec;

public class TrieNode {
	char data;
	int childcount;
	TrieNode[] children;
	boolean isTerminating;
	public TrieNode(char data) {
		this.data=data;
		children=new TrieNode[26];
	}
	public TrieNode getchild(char charAt) {
		return children[charAt-'a'];
		
	}
	public void addchild(char CharAt, TrieNode child) {
		 children[CharAt-'a']=child;
		
	}
	public void removechild(char charAt) {
		children[charAt-'a']=null;
		
	}
}
