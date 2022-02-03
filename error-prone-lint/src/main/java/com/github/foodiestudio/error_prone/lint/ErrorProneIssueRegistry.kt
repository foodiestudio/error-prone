package com.github.foodiestudio.error_prone.lint

import com.android.tools.lint.client.api.IssueRegistry
import com.android.tools.lint.detector.api.CURRENT_API
import com.android.tools.lint.detector.api.Issue

class ErrorProneIssueRegistry : IssueRegistry {

    override val issues: List<Issue> = TODO()

    override val api: Int
        get() = CURRENT_API
}