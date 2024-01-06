package com.example.findrestaurant.presentation.dialog

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.findrestaurant.databinding.ActivityDetailBinding
import com.example.findrestaurant.model.InfoDetail
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class DetailActivity @Inject constructor() : AppCompatActivity() {

    companion object {
        private const val EXTRA_DETAIL_DATA = "EXTRA_DETAIL_DATA"

        //Todo 상세 화면에서 표시할 '상세 정보 데이터'를 이전 화면에서 전달 받아 사용한다. SomeInfoDetail.
        fun start(activity: Activity, detail: InfoDetail) {
            Intent(activity, DetailActivity::class.java).apply {
                addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
                putExtra(EXTRA_DETAIL_DATA, detail)
            }.also {
                activity.startActivity(it)
            }
        }
    }

    private lateinit var mContext: Context
    private lateinit var binding: ActivityDetailBinding

    private val InfoDetail: InfoDetail? by lazy {
        intent.getParcelableExtra(EXTRA_DETAIL_DATA)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        mContext = this@DetailActivity
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
