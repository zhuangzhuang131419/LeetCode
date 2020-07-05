package Q297;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SerializeAndDeserializeBinaryTreeTest {

    @Test
    void serialize() {
        SerializeAndDeserializeBinaryTree s = new SerializeAndDeserializeBinaryTree();
//        Assert.assertEquals("1,2,3", s.serialize(s.deserialize("1,2,3")));
//        Assert.assertEquals("1,2,3,null,null,4,5", s.serialize(s.deserialize("1,2,3,null,null,4,5")));
        Assert.assertEquals("5,2,3,null,null,2,4,3,1", s.serialize(s.deserialize("5,2,3,null,null,2,4,3,1")));
    }

    @Test
    void deserialize() {
    }
}