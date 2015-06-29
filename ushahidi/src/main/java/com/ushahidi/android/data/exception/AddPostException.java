/*
 * Copyright (c) 2015 Ushahidi Inc
 *
 * This program is free software: you can redistribute it and/or modify it under
 *  the terms of the GNU Affero General Public License as published by the Free
 *  Software Foundation, either version 3 of the License, or (at your option)
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful, but WITHOUT
 *  ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 *  FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program in the file LICENSE-AGPL. If not, see
 *  https://www.gnu.org/licenses/agpl-3.0.html
 */

package com.ushahidi.android.data.exception;

/**
 * Exception thrown by the {@link com.ushahidi.android.data.database.PostDatabaseHelper} when a
 * {@PostEntity} can't be added to the database.
 *
 * @author Ushahidi Team <team@ushahidi.com>
 */
public class AddPostException extends Exception {

    public AddPostException() {
        super();
    }

    public AddPostException(final String message) {
        super(message);
    }

    public AddPostException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public AddPostException(final Throwable cause) {
        super(cause);
    }
}