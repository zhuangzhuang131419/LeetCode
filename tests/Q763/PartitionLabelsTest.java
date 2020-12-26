package Q763;

import org.junit.Test;

import static org.junit.Assert.*;

public class PartitionLabelsTest {

    @Test
    public void partitionLabels() {
        PartitionLabels p = new PartitionLabels();

        assertArrayEquals(p.partitionLabels("caedbdedda").toArray(), new Object[]{1, 9});
    }
}