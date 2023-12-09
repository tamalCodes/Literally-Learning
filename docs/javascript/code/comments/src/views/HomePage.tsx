import React, { useState } from "react";
import { SingleComment as SingleCommentType } from "../types/CommentTypes";
import SingleComment from "../components/SingleComment";

const HomePage = () => {
  const [comments, setComments] = useState<SingleCommentType[]>([]);

  const [singleComment, setSingleComment] = useState<SingleCommentType>({
    id: 0,
    content: "",
    children: [],
  });

  const handleChange = (e: React.ChangeEvent<HTMLTextAreaElement>) => {
    setSingleComment({
      id: Math.random(),
      content: e.target.value,
      children: [],
    });
  };

  return (
    <>
      <div className="hompage_container">
        <div className="comment_box">
          <textarea
            className="comment_box_textarea"
            placeholder="Write a comment..."
            name="content"
            value={singleComment.content}
            onChange={handleChange}
          />
          <button
            type="submit"
            className="comment_box_submitbtn"
            onClick={() => {
              setComments([...comments, singleComment]);
              setSingleComment({
                id: 0,
                content: "",
                children: [],
              });
            }}
          >
            Comment
          </button>

          <button
            type="submit"
            className="comment_box_submitbtn"
            onClick={() => {
              console.log(comments);
            }}
          >
            Show
          </button>
        </div>

        <div className="homepage_comments_container">
          {comments.length > 0 ? (
            comments?.map((comment) => {
              return (
                <SingleComment
                  comment={comment}
                  comments={comments}
                  setComments={setComments}
                  key={comment?.id}
                />
              );
            })
          ) : (
            <p>No comments yet</p>
          )}
        </div>
      </div>
    </>
  );
};

export default HomePage;
