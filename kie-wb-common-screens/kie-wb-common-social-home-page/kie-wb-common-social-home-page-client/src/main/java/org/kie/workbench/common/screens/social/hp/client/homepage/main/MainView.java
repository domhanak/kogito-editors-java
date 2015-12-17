/*
 * Copyright 2012 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.workbench.common.screens.social.hp.client.homepage.main;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Widget;
import org.kie.uberfire.social.activities.client.widgets.timeline.regular.SocialTimelineWidget;
import org.uberfire.client.mvp.PlaceManager;

@Dependent
public class MainView extends Composite
        implements MainPresenter.View {

    interface MainViewBinder
            extends
            UiBinder<Widget, MainView> {
    }

    private static MainViewBinder uiBinder = GWT.create( MainViewBinder.class );


    @UiField
    FlowPanel mainPanel;

    @Inject
    private PlaceManager placeManager;

    public MainView() {
        initWidget( uiBinder.createAndBindUi( this ) );
    }

    @Override
    public void setSocialWidget( SocialTimelineWidget socialTimelineWidget ) {
        mainPanel.clear();
        mainPanel.add( socialTimelineWidget );
    }

}