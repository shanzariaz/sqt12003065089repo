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
public class Empty extends TestCase {
    
    public Empty(String testName) {
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
    GitBST i=new GitBST();
    public void testEmpty(){
        assertTrue("empty or not", i.IsEmpty());
    }

    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
}
