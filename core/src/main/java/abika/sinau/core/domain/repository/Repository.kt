package abika.sinau.core.domain.repository

import abika.sinau.core.data.source.Resource
import abika.sinau.core.domain.model.BusinessDetailDomain
import abika.sinau.core.domain.model.BusinessReviewDomain
import abika.sinau.core.domain.model.BusinessSearchDomain


/**
 * @author by Abika Chairul Yusri on 12/7/2022
 */
interface Repository {
    //    suspend fun getBusinessSearch(request: BusinessSearchRequest): Resource<BusinessSearchResponse>
    suspend fun getBusinessSearch(
        location: String?,
        price: ArrayList<String>?,
        limit: Int?
    ): Resource<BusinessSearchDomain>

    //    suspend fun getBusinessSearch(location: String): Resource<BusinessSearchResponse>
    suspend fun getBusinessDetail(businessId: String): Resource<BusinessDetailDomain>
    suspend fun getBusinessReview(businessId: String): Resource<BusinessReviewDomain>
}