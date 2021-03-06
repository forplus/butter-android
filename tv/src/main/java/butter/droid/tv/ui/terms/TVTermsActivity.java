/*
 * This file is part of Butter.
 *
 * Butter is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Butter is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Butter. If not, see <http://www.gnu.org/licenses/>.
 */

package butter.droid.tv.ui.terms;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import butter.droid.tv.R;
import butter.droid.tv.TVButterApplication;
import butter.droid.tv.ui.TVBaseActivity;

public class TVTermsActivity extends TVBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TVButterApplication.getAppContext()
                .getComponent()
                .inject(this);

        super.onCreate(savedInstanceState, R.layout.activity_terms);
    }

    public static Intent getIntent(Context context) {
        return new Intent(context, TVTermsActivity.class);
    }

}
