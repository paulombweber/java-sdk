/*
 * (C) Copyright IBM Corp. 2020.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.watson.visual_recognition.v4.model;

import static org.testng.Assert.*;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.watson.visual_recognition.v4.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;

/** Unit test class for the Location model. */
public class LocationTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata =
      TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLocation() throws Throwable {
    Location locationModel =
        new Location.Builder()
            .top(Long.valueOf("26"))
            .left(Long.valueOf("26"))
            .width(Long.valueOf("26"))
            .height(Long.valueOf("26"))
            .build();
    assertEquals(locationModel.top(), Long.valueOf("26"));
    assertEquals(locationModel.left(), Long.valueOf("26"));
    assertEquals(locationModel.width(), Long.valueOf("26"));
    assertEquals(locationModel.height(), Long.valueOf("26"));

    String json = TestUtilities.serialize(locationModel);

    Location locationModelNew = TestUtilities.deserialize(json, Location.class);
    assertTrue(locationModelNew instanceof Location);
    assertEquals(locationModelNew.top(), Long.valueOf("26"));
    assertEquals(locationModelNew.left(), Long.valueOf("26"));
    assertEquals(locationModelNew.width(), Long.valueOf("26"));
    assertEquals(locationModelNew.height(), Long.valueOf("26"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testLocationError() throws Throwable {
    new Location.Builder().build();
  }
}
