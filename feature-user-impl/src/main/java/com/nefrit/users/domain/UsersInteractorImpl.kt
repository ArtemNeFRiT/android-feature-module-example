package com.nefrit.users.domain

import com.nefrit.feature_user_api.domain.interfaces.UserInteractor
import com.nefrit.feature_user_api.domain.interfaces.UserRepository
import com.nefrit.feature_user_api.domain.model.User
import io.reactivex.Observable
import javax.inject.Inject

class UsersInteractorImpl @Inject constructor(
    private val userRepository: UserRepository
) : UserInteractor {

    override fun getUsers(): Observable<List<User>> {
        return userRepository.getUsers()
    }

    override fun getUser(id: Int): Observable<User> {
        return userRepository.getUser(id)
    }
}