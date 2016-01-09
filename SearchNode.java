/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import gitbst.GitBST;
import junit.framework.TestCase;

/**
 *
 * @author Shanza Riaz Mughal
 */
public class SearchNode extends TestCase {
    
    public SearchNode(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void teatsearchNode(){
        GitBST j=new GitBST();
        j.insertNode(80);
        j.insertNode(40);
        j.insertNode(100);
        j.insertNode(2);
        assertTrue("found", j.searchNode(40));
        assertTrue("found", j.searchNode(100));
        assertTrue("not present",j.searchNode(45));
    }
    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
}
