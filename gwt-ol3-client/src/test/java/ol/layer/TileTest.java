/*******************************************************************************
 * Copyright 2014, 2017 gwt-ol3
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package ol.layer;

import ol.GwtOL3BaseTestCase;

/**
 * A test case for {@link ol.layer.Tile}.
 *
 * @author Tino Desjardins
 *
 */
public class TileTest extends GwtOL3BaseTestCase {

    @SuppressWarnings({ "static-method", "javadoc" })
    public void testTileLayer() {

        injectUrlAndTest(new TestWithInjection() {

            @Override
            public void test() {

                TileLayerOptions tileLayerOptions = new TileLayerOptions();
                assertNotNull(tileLayerOptions);
                Tile tile = new Tile(tileLayerOptions);
                assertTrue(tile instanceof Base);
                assertTrue(tile instanceof Tile);

            }

        });

    }

}
