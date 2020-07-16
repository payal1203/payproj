package trie_lec;

public class Trie {
TrieNode root;
int count;
    public void insert(String word) {
    	//if insert(root,word) {
    		//count++
    	//}
    }
    private boolean insert(TrieNode root,String word) {
    	if(word.length()==0) {
    		if(root.isTerminating) {
    			return false;
    		}
    		else {
    			root.isTerminating=true;
    			return true;
    		}
    	}
    	TrieNode child=root.getchild(word.charAt(0));
    	if(child==null) {
    		child=new TrieNode(word.charAt(0));
    		root.addchild(word.charAt(0),child);
    	}
    	
    	return insert(child,word.substring(1));
    	
    }
    private boolean search(String word) {
    	return search(root, word);
    }
    private boolean search(TrieNode root,String word) {
    	if(word.length()==0) {
    		return root.isTerminating;
    	}
    	TrieNode child=root.getchild(word.charAt(0));
    	if(child==null) {
    		return false;
    	}
    	else {
    		return search(child,word.substring(1));
    	}
    }
    //public  remove(String word) {
    //	return remove(root,word);
    //}
    public boolean remove(TrieNode root,String word) {
    	if(word.length()==0) {
    		if(root.isTerminating==true) {
    			if(root.childcount!=0) {
        			root.isTerminating=false;
    		  }
    			//else {
    				
    			//}
    	     }
    		
    	 	}
    	TrieNode child=root.getchild(word.charAt(0));
    	if(child!=null) {
    		remove(child,word.substring(1));
    		root.removechild(word.charAt(0));
    	}
    	return true;
    }
   
}
