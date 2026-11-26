package com.example.questapi.repositori

import com.example.questapi.apiservice.ServiceApiSiswa
import com.example.questapi.modeldata.DataSiswa

interface RepositoryDataSiswa {
    suspend fun getDataSiswa() : List<DataSiswa>
    suspend fun postdataSiswa(dataSiswa: DataSiswa):retrofit2.Response<Void>
}

class JaringanRepositoryDataSiswa(
    private val serviceApiSiswa: ServiceApiSiswa
) : RepositoryDataSiswa{
    override suspend fun getDataSiswa(): List<DataSiswa> = serviceApiSiswa.getSiswa()
    override suspend fun postdataSiswa(dataSiswa: DataSiswa): retrofit2.Response<Void> =
        serviceApiSiswa.postSiswa(dataSiswa)
}
