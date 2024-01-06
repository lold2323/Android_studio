package com.example.findrestaurant.presentation.dialog.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.findrestaurant.databinding.RowInfoBinding
import com.example.findrestaurant.model.InfoDetail

//Todo 리스트어덥터 샘플. 리스트를 사용하는 경우, MainActivity 와 함께 사용 예시를 확인.
// 데이터 타입과 레이아웃 관련 코드만 바꾸면 큰 수정 없이 사용 가능.
class InfoListAdapter : ListAdapter<InfoDetail, RecyclerView.ViewHolder>(
    object : DiffUtil.ItemCallback<InfoDetail>() {
        override fun areItemsTheSame(oldItem: InfoDetail, newItem: InfoDetail): Boolean =
            oldItem == newItem

        override fun areContentsTheSame(oldItem: InfoDetail, newItem: InfoDetail): Boolean =
            true
    }
) {

    var onItemClickListener: (InfoDetail) -> Unit = { _ -> }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return InfoViewHolder(
            RowInfoBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false,
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as InfoViewHolder).bind(getItem(position))
    }

    @SuppressLint("NotifyDataSetChanged")
    fun submitListAndScroll(list: List<InfoDetail>?, needScroll: (Boolean) -> Unit) {
        val isAdded = itemCount < (list?.size ?: 0)
        super.submitList(list) { notifyDataSetChanged() }
        needScroll.invoke(isAdded)
    }

    inner class InfoViewHolder(private val binding: RowInfoBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(data: InfoDetail) {
            binding.root.setOnClickListener {
                onItemClickListener(data)
            }


        }
    }
}