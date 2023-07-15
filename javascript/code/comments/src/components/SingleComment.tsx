import { useState } from "react";
import {
  SingleCommentProps,
  SingleComment as SingleCommentType,
} from "../types/CommentTypes";

const SingleComment = ({
  comment,
  comments,
  setComments,
  ischild,
}: SingleCommentProps) => {
  const [singleComment, setSingleComment] = useState<SingleCommentType>({
    id: 0,
    content: "",
    children: [],
  });

  const [showReplyBox, setShowReplyBox] = useState<boolean>(false);

  const updateCommentChildren = (
    comments: SingleCommentType[],
    targetId: number,
    newChildComment: SingleCommentType
  ): SingleCommentType[] => {
    return comments.map((comment) => {
      if (comment.id === targetId) {
        return {
          ...comment,
          children: [...comment.children, newChildComment],
        };
      }

      if (comment.children && comment.children.length > 0) {
        return {
          ...comment,
          children: updateCommentChildren(
            comment.children,
            targetId,
            newChildComment
          ),
        };
      }

      return comment;
    });
  };

  const handleAddReply = (e?: React.ChangeEvent<HTMLTextAreaElement>) => {
    e?.preventDefault();

    if (setComments && comments) {
      const updatedComments = updateCommentChildren(
        comments,
        comment.id,
        singleComment
      );

      setComments(updatedComments);
    }
  };

  const handleChange = (e: React.ChangeEvent<HTMLTextAreaElement>) => {
    setSingleComment({
      id: Math.random(),
      content: e.target.value,
      children: [],
    });
  };

  return (
    <>
      <div className={`singlecomment_parent ${ischild ? `haschild` : ``}`}>
        <div className="singlecomment_body">
          <img
            src="https://spellquiz.com/upload/file?d=user-avatars/avatar-2.png"
            alt=""
            className="singlecomment_avatar"
          />

          <div className="singlecomment_contentparent">
            <div className="singlecomment_content">
              <p>{comment?.content}</p>
            </div>

            {showReplyBox && (
              <textarea
                className="comment_box_textarea"
                placeholder="Add a reply..."
                name="content"
                value={singleComment.content}
                onChange={handleChange}
              />
            )}

            <div
              className="singlecomment_buttons"
              onClick={() => {
                if (singleComment.content.length > 0) {
                  console.log("Here");
                  handleAddReply();
                  setSingleComment({
                    id: 0,
                    content: "",
                    children: [],
                  });

                  setShowReplyBox(!showReplyBox);
                } else {
                  setShowReplyBox(!showReplyBox);
                }
              }}
            >
              <p>Reply</p>
            </div>
          </div>
        </div>
        {comment?.children &&
          comment?.children?.length > 0 &&
          comment?.children?.map((childComment) => {
            return (
              <SingleComment
                key={comment.id}
                comment={childComment}
                comments={comments}
                setComments={setComments}
                ischild={true}
              />
            );
          })}
      </div>
    </>
  );
};

export default SingleComment;
