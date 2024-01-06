package com.example.findrestaurant.network

import com.example.findrestaurant.model.InfoRequest
import com.example.findrestaurant.model.InfoResponse
import retrofit2.Response
import timber.log.Timber
import javax.inject.Inject

//Todo 사용하려는 공공 api 에 맞춰 수정하여 사용.
// JobInfoRepository.kt 파일을 참고.
interface InfoRepository {

    suspend fun getInfoList(request: InfoRequest): Result<InfoResponse, Exception>

}

class InfoRepositoryImpl @Inject constructor(
    private val service: InfoService,
): InfoRepository {
    override suspend fun getInfoList(request: InfoRequest): Result<InfoResponse, Exception> {
        return request(
            service.getInfoList(request)
        ) { it }
    }

    //Todo 요청 응답에 대한 전처리. 데이터의 형태와 처리 방식에 따라 수정이 필요함...
    private fun <T, R> request(
        response: Response<T>,
        transform: (T) -> R,
    ): Result<R, Exception> {
        return try {
            if (response.isSuccessful && response.body() != null) {
                Result.Success(transform(response.body()!!))
            } else {
                Result.Error(Exception("Fail to retrieve data."))
            }
        } catch (exception: Exception) {
            Timber.e(exception.toString())
            Result.Error(exception)
        }
    }
}