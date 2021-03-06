/*
 * ******************************************************************************
 *   Copyright (c) 2013 Gabriele Mariotti.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *  *****************************************************************************
 */

package it.gmariotti.cardslib.demo.cards;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import it.gmariotti.cardslib.demo.R;
import it.gmariotti.cardslib.library.internal.CardHeader;

/**
 * This class provides an example of custom of inner layout in Header.
 * It uses carddemo_example_inner_header layout.
 * <p/>
 * You have to override the {@link #setupInnerViewElements(android.view.ViewGroup, android.view.View)});
 *
 * @author Gabriele Mariotti (gabri.mariotti@gmail.com)
 */
public class CustomHeaderInnerCard extends CardHeader {

    public CustomHeaderInnerCard(Context context) {
        super(context, R.layout.carddemo_example_inner_header);
    }

    @Override
    public void setupInnerViewElements(ViewGroup parent, View view) {

        if (view != null) {
            TextView t1 = (TextView) view.findViewById(R.id.text_example1);
            if (t1 != null)
                t1.setText(getContext().getString(R.string.demo_header_exampletitle1));

            TextView t2 = (TextView) view.findViewById(R.id.text_example2);
            if (t2 != null)
                t2.setText(getContext().getString(R.string.demo_header_exampletitle2));
        }
    }
}
