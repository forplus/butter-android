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

package butter.droid.tv.ui.detail.movie;

import butter.droid.base.manager.internal.provider.ProviderManager;
import butter.droid.base.ui.FragmentScope;
import dagger.Module;
import dagger.Provides;

@Module(includes = TVMovieDetailBindModule.class)
public class TVMovieDetailModule {

    private final TVMovieDetailsView view;

    public TVMovieDetailModule(final TVMovieDetailsView view) {
        this.view = view;
    }

    @Provides @FragmentScope public TVMovieDetailsView provideView() {
        return view;
    }

    @Provides @FragmentScope public TVMovieDetailsPresenter providePresenter(TVMovieDetailsView view, ProviderManager providerManager) {
        return new TVMovieDetailsPresenterImpl(view, providerManager);
    }

}
