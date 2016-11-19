initSidebarItems({"fn":[["done","Creates a new \"leaf future\" which will resolve with the given result."],["empty","Creates a future which never resolves, representing a computation that never finishes."],["failed","Creates a \"leaf future\" from an immediate value of a failed computation."],["finished","Creates a \"leaf future\" from an immediate value of a finished and successful computation."],["join_all","Creates a future which represents a collection of the results of the futures given."],["lazy","Creates a new future which will eventually be the same as the one created by the closure provided."],["select_all","Creates a new future which will select over a list of futures."],["select_ok","Creates a new future which will select the first successful future over a list of futures."]],"struct":[["AndThen","Future for the `and_then` combinator, chaining a computation onto the end of another future which completes successfully."],["CatchUnwind","Future for the `catch_unwind` combinator."],["Done","A future representing a value that is immediately ready."],["Empty","A future which is never resolved."],["Failed","A future representing a finished but erroneous computation."],["Finished","A future representing a finished successful computation."],["Flatten","Future for the `flatten` combinator, flattening a future-of-a-future to get just the result of the final future."],["FlattenStream","Future for the `flatten_stream` combinator, flattening a future-of-a-stream to get just the result of the final stream as a stream."],["Fuse","A future which \"fuse\"s a future once it's been resolved."],["IntoStream","Future that forwards one element from the underlying future (whether it is success of error) and emits EOF after that."],["Join","Future for the `join` combinator, waiting for two futures to complete."],["Join3","Future for the `join3` combinator, waiting for three futures to complete."],["Join4","Future for the `join4` combinator, waiting for four futures to complete."],["Join5","Future for the `join5` combinator, waiting for five futures to complete."],["JoinAll","A future which takes a list of futures and resolves with a vector of the completed values."],["Lazy","A future which defers creation of the actual future until a callback is scheduled."],["Map","Future for the `map` combinator, changing the type of a future."],["MapErr","Future for the `map_err` combinator, changing the error type of a future."],["OrElse","Future for the `or_else` combinator, chaining a computation onto the end of a future which fails with an error."],["Select","Future for the `select` combinator, waiting for one of two futures to complete."],["SelectAll","Future for the `select_all` combinator, waiting for one of any of a list of futures to complete."],["SelectNext","Future yielded as the second result in a `Select` future."],["SelectOk","Future for the `select_ok` combinator, waiting for one of any of a list of futures to succesfully complete. unlike `select_all`, this future ignores all but the last error, if there are any."],["Then","Future for the `then` combinator, chaining computations on the end of another future regardless of its outcome."]],"trait":[["Future","Trait for types which are a placeholder of a value that will become available at possible some later point in time."],["IntoFuture","Class of types which can be converted themselves into a future."]],"type":[["BoxFuture","A type alias for `Box<Future + Send>`"]]});