package cz.tokar.android.app.myarchitecture1.ui.presenter.favorite

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cz.tokar.android.app.myarchitecture1.R
import cz.tokar.android.app.myarchitecture1.ui.presenter.base.BaseFragment
import cz.tokar.android.app.myarchitecture1.ui.presenter.main.MainFragment
import kotlinx.android.synthetic.*
import timber.log.Timber


class FavoriteFragment : BaseFragment() {

  companion object {
    val TAG = FavoriteFragment::class.java.simpleName
    fun newInstance() = FavoriteFragment()
  }

  private lateinit var viewModel: FavoriteViewModel

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
    Timber.v("[%s]::[onCreateView]", MainFragment.TAG)
    val view = inflater.inflate(R.layout.frg_favorite, container, false)
    return view
  }


  override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)
    viewModel = ViewModelProviders.of(this, viewModelFactory).get(FavoriteViewModel::class.java)

//    setupToolbar(myToolbar, R.string.toolbar_favorite)
  }

}
