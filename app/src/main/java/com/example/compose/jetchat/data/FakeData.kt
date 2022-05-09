/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.compose.jetchat.data

import com.example.compose.jetchat.R
import com.example.compose.jetchat.conversation.ConversationUiState
import com.example.compose.jetchat.conversation.Message
import com.example.compose.jetchat.profile.ProfileScreenState

private val initialMessages = listOf(
    Message(
        "Dave Boesen",
        "let me know when you are avail - so  \n" +
                "we can make sure you are not \n" +
                "getting those errors.",
        "May 27th, 2021"
    ),
    Message(
        "Jeff Herman",
        "I'm pretty much available all day  \n" +
                "if you give me some notice. \n",
        "May 27th, 2021",
        R.drawable.sticker
    ),
    Message(
        "Jeff Herman",
        "I'm available right now if you have a few minutes. \n",
        "May 27th, 2021"
    ),
    Message(
        "Dave Boesen",
        "Are you online now? \n",
        "May 27th, 2021"
    ),
    Message(
        "Jeff Herman",
        "Yes.",
        "May 27th 2021"
    ),
    Message(
        "Jeff Herman",
        "Do you have a Zoom link? \n" +
                "Saw it.",
        "May 27th, 2021"
    ),
    Message(

        "Dave Boesen",
        "saw your comment on the\n" +
                " assignments - what time do you  \n" +
                "have today to fix this or when \n" +
                "is the next available time? \n",
        "June 3rd, 2021"

    ),
    Message(
        "Jeff Herman",
        "I just saw your message. I think I'm  \n" +
                "up and running okay. Let me \n" +
                "see if I need further help.",
        "June 4th, 2021"
    ),
    Message(
        "Jeff Herman",
        "Regarding the Getter and Setter\n" +
                "function, I had trouble formatting\n" +
                "it properly and kept getting a \n" +
                " compiler error when I tried to use it. \n" +
                "I tried to use this link but it still had \n" +
                "errors https:www.programiz.com  \n" +
                "kotlin different ways to get around  \n" +
                "the error, but everything I tried just \n" +
                "gave me a different error.",
        "June 7th, 2021"

    ),
    Message(

        "Dave Boesen",
        "Getter and Setting  in Kotlin are \n" +
                " optional - but did you look \n" +
                "at the Advanced Class get/set video? \n",
        "June 8th 2021"
    ),
    Message(

        "Jeff Herman",
        "Hi. I couldn't find that tutorial. There \n" +
                "was the main tutorial on classes,\n" +
                "and then there was like 5 or so  \n" +
                "written tutorials. But, I can't locate \n" +
                "the tutorial you mentioned. Is that \n" +
                " on Canvas under the Classes \n" +
                "module? \n",
        "June 8th 2021"
    ),
    Message(

        "Dave Boesen",
        "The one I mentioned is under \n" +
                "advanced classes added it to " +
                "the classes module also ",
        "June 8th 2021"
    ),
    Message(

        "Jeff Herman",
        "Ok, I'll take a look. Thanks.\n",
        "June 8th 2021"
    )
)

val exampleUiState = ConversationUiState(
    initialMessages = initialMessages,
    channelName = "#composers",
    channelMembers = 42
)

/**
 * Example colleague profile
 */
val colleagueProfile = ProfileScreenState(
    userId = "12345",
    photo = R.drawable.someone_else,
    name = "Dave Boesen",
    status = "Away",
    displayName = "dave",
    position = "McHenry College teacher",
    twitter = "twitter.com/daveboeson",
    timeZone = "12:25 AM local time (Central Daylight Time)",
    commonChannels = "2"
)

/**
 * Example "me" profile.
 */
val meProfile = ProfileScreenState(
    userId = "Jeff Herman",
    photo = R.drawable.me,
    name = "Jeff Herman",
    status = "Online",
    displayName = "Jeff",
    position = "McHenry College student",
    twitter = "twitter.com/aliconors",
    timeZone = "In your timezone",
    commonChannels = null
)
