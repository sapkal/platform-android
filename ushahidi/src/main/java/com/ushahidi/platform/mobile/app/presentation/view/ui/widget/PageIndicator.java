/*
 * Copyright (C) 2011 Patrik Akerfeldt
 * Copyright (C) 2011 Jake Wharton
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ushahidi.platform.mobile.app.presentation.view.ui.widget;

import android.support.v4.view.ViewPager;

/**
 * A PageIndicator is responsible to show an visual indicator on the total views
 * number and the current visible view.
 */
public interface PageIndicator extends ViewPager.OnPageChangeListener {

    /**
     * Bind the indicator to a ViewPager.
     */
    void setViewPager(ViewPager view);

    /**
     * Bind the indicator to a ViewPager.
     */
    void setViewPager(ViewPager view, int initialPosition);

    void setCurrentItem(int item);

    /**
     * Set a page change listener which will receive forwarded events.
     */
    void setOnPageChangeListener(ViewPager.OnPageChangeListener listener);

    void onPageTitleSelected(int position);

    /**
     * Notify the indicator that the fragment list has changed.
     */
    void notifyDataSetChanged();
}
