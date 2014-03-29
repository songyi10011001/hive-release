/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hive.ql.io;

import org.junit.Test;

<<<<<<< HEAD
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;

import static org.junit.Assert.assertEquals;
=======
>>>>>>> upstream/branch-0.13
import static org.junit.Assert.assertTrue;

public class TestRecordIdentifier {
  @Test
  public void TestOrdering() throws Exception {
    RecordIdentifier left = new RecordIdentifier(100, 200, 1200);
    RecordIdentifier right = new RecordIdentifier();
    right.setValues(100L, 200, 1000L);
    assertTrue(right.compareTo(left) < 0);
    assertTrue(left.compareTo(right) > 0);
    left.set(right);
    assertTrue(right.compareTo(left) == 0);
    right.setRowId(2000);
    assertTrue(right.compareTo(left) > 0);
    left.setValues(1, 2, 3);
    right.setValues(100, 2, 3);
    assertTrue(left.compareTo(right) < 0);
    assertTrue(right.compareTo(left) > 0);
    left.setValues(1, 2, 3);
    right.setValues(1, 100, 3);
    assertTrue(left.compareTo(right) < 0);
    assertTrue(right.compareTo(left) > 0);
  }
<<<<<<< HEAD

  @Test
  public void readWrite() throws Exception {
    ByteArrayOutputStream bout = new ByteArrayOutputStream();
    DataOutput out = new DataOutputStream(bout);
    RecordIdentifier ri = new RecordIdentifier(1L, 2, 3L);
    ri.write(out);
    ri = new RecordIdentifier();
    DataInput in = new DataInputStream(new ByteArrayInputStream(bout.toByteArray()));
    ri.readFields(in);
    assertEquals(1L, ri.getTransactionId());
    assertEquals(2, ri.getBucketId());
    assertEquals(3L, ri.getRowId());
  }
=======
>>>>>>> upstream/branch-0.13
}
