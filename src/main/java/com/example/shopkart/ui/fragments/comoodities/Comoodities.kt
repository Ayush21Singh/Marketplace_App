package com.example.shopkart.ui.fragments.comoodities

import android.os.Bundle
import android.view.*
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.shopkart.R
import com.example.shopkart.data.model.Product
import com.example.shopkart.databinding.FragmentComooditiesBinding
import com.example.shopkart.ui.fragments.base.BaseFragment
import com.example.shopkart.ui.fragments.product.ProductFragmentDirections
import com.example.shopkart.util.Resource
import com.example.shopkart.util.showSnackBar
import javax.inject.Inject

class Comoodities : BaseFragment() {

    lateinit var mBinding: FragmentComooditiesBinding

    //private val mViewModel: ComooditiesViewModel by viewModels()

    @Inject
    //lateinit var mAdapter: ComooditiesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        mBinding = FragmentComooditiesBinding.inflate(inflater, container,false)
        //observeLiveEvents()
        return mBinding.root
    }

    override fun onResume() {
        super.onResume()
        //mViewModel.getProducts()
    }

    private fun hideRecyclerViewShowNoRecordFound() {
        mBinding.govProducts.isVisible = false
        mBinding.tvNoProductsFound.isVisible = true
    }

    private fun showRecyclerViewHideNoRecordFound() {
        mBinding.govProducts.isVisible = true
        mBinding.tvNoProductsFound.isVisible = false
    }

    /**
     * Adds products in the recyclerview.

    private fun addDataToRecyclerView(products: List<Product>) {
        mBinding.govProducts.apply {
            adapter = mAdapter
            mAdapter.submitList(products)
            mAdapter.setDeleteProductListener { product ->

            }
            mAdapter.setOnProductItemClickListener {
                findNavController().navigate(
                    ProductFragmentDirections.actionProductFragmentToProductDetailFragment(it.id,it.user_id)
                )
            }
        }
    }
     */
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.main_menu,menu)
    }

    override fun onPrepareOptionsMenu(menu: Menu) {
        super.onPrepareOptionsMenu(menu)
        val settingMenu = menu.findItem(R.id.menu_settings)
        val cartMenu = menu.findItem(R.id.menu_cart)

        // If add product menu item is not null and visible then hide add product menu item.
        settingMenu?.let {
            if(settingMenu.isVisible) {
                settingMenu.isVisible = false
            }
        }

        // If cart menu item is not null and visible then hide cart menu item.
        cartMenu?.let {
            if(cartMenu.isVisible) {
                cartMenu.isVisible = false
            }
        }
    }



}