/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.drools.workbench.screens.scenariosimulation.client.collectioneditor;

import com.google.gwtmockito.GwtMockitoTestRunner;
import org.junit.Before;
import org.junit.runner.RunWith;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;

@RunWith(GwtMockitoTestRunner.class)
public class ItemElementViewImplTest extends ElementViewImplTest<ItemElementView, ItemElementView.Presenter> {

    @Before
    public void setup() {
        elementPresenterMock = mock(ItemElementView.Presenter.class);
        elementView = spy(new ItemElementViewImpl() {
            {
                this.presenter = elementPresenterMock;
                this.faAngleRight = faAngleRightMock;
                this.itemSeparatorText = itemSeparatorTextMock;
            }
        });
    }

}
